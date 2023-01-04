package ie.andrew.basiccrud.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String postText;

    protected Post(){}

    public Post(String postText) {
        this.postText = postText;
    }

    public Long getId() {
        return id;
    }

    public String getPostText() {
        return postText;
    }
}
