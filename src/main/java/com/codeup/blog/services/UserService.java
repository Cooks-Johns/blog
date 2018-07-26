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

    public SecurityProperties.User findRandomUser() {
        List<SecurityProperties.User> user = userDao.findAll();
        Random ranUser =  new Random();

        return user.get(ranUser.nextInt(user.size()));
    }

    public User findUserById(long id) {
        return userDao.findUserById(id);
    }

    public User save(User user) {
        return userDao.save(user);
    }
}
