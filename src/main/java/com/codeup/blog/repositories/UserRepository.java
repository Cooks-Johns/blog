package com.codeup.blog.repositories;


import com.codeup.blog.models.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<SecurityProperties.User,Long> {
    List<SecurityProperties.User> findAll();
    SecurityProperties.User findByUsername(String username);
    User findUsersById(long id);


    User save(User user);

    User findUsersById(String s);

    User findUserById(long id);
}