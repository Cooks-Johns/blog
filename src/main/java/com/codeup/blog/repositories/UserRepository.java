package com.codeup.blog.repositories;


import com.codeup.blog.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAll();
    User findByUsername(String username);
    User findUsersById(String id);

    User findUsersById(long id);
}