package ie.andrew.basiccrud.services;

import ie.andrew.basiccrud.models.Post;
import ie.andrew.basiccrud.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Iterable<Post> getAll() {
        return postRepository.findAll();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }
}
