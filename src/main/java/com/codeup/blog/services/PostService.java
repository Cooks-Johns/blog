package com.codeup.blog.services;



import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.repositories.PostRepository;
import com.codeup.blog.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postDao;
    private final UserRepository usersDao;


    public PostService(PostRepository postDao, UserRepository usersDao) {
        this.postDao = postDao;
        this.usersDao = usersDao;
    }

    public List<Post> search(String searchTerm) {
        return postDao.findByBodyContainsOrTitleContains(searchTerm, searchTerm);
    }


    public List<Post> findAll() {
        return postDao.findAll();
    }

    public Post save(Post post) {
        User sessionUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = usersDao.findUsersById(sessionUser.getId());
        post.setUser(user);


        postDao.save(post);
        return post;
    }

    public void delete(long id) {
        postDao.delete(id);
    }

    public Post findOne(long id) {
        return postDao.findOne(id);
    }


    public Post findById(long id) {
        return postDao.findById(id);
    }

    public Post edit(Post post, long id) {

        return postDao.save(post);

    }

}

