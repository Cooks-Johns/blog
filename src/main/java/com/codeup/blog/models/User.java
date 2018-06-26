package com.codeup.blog.models;


import javax.persistence.*;
import java.util.List;

@Entity@Table(name ="users")

public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User() {
    }

    public User(User copy) {
        id = copy.id;
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    public long getId() {
        return id;
    }

    public void setId(
            long id,
            String username,
            String email,
            String password,
            List<Post> posts) {

                this.id = id,
                this.username = username,
                this.email = email,
                this.password = password,
                this.posts = posts
    }
}
