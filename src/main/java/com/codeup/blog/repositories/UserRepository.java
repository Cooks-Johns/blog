package com.codeup.blog.repositories;

import com.codeup.blog.models.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<SecurityProperties.User,Long> {
    List<SecurityProperties.User> findAll();
    SecurityProperties.User findByUsername(String username);
    SecurityProperties.User findUsersById(long id);


}