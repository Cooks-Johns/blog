package com.codeup.blog.services;

import com.codeup.blog.models.User;
import com.codeup.blog.repositories.UserRepository;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {

    private UserRepository userDao;

    public UserService(UserRepository userDao) {
        this.userDao = userDao;
    }

    public User findRandomUser(){
        List<User> users = userDao.findAll();
        Random r = new Random();

        return users.get(r.nextInt(users.size()));
    }

    public User findUserById(long id){
        return userDao.findUsersById(id);
    }

    public User save(User user){
        return userDao.save(user);
    }


}
