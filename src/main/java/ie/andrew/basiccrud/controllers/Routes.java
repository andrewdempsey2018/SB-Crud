package ie.andrew.basiccrud.controllers;

import ch.qos.logback.core.model.Model;
import ie.andrew.basiccrud.models.Post;
import ie.andrew.basiccrud.repositories.PostRepository;
import ie.andrew.basiccrud.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Routes {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    private ModelAndView Index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("posts", postService.getAll());
        return modelAndView;
    }

    @GetMapping("/about")
    private String About(){
        return "about";
    }

    @GetMapping("/new")
    private String New(Post post){
        return "new";
    }

    @GetMapping("/h2-console")
    private String Console(){
        return "h2-console";
    }

    @PostMapping("/create_new_post")
    public String createTodoItem(Post newPost) {

        postService.save(newPost);
        return "redirect:/";
    }
}
