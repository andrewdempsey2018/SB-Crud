package ie.andrew.basiccrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Routes {

    @GetMapping("/about")
    private String About(){
        return "about";
    }

    @GetMapping("/h2-console")
    private String Console(){
        return "h2-console";
    }
}
