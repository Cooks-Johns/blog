package com.codeup.blog.repositories;

import com.codeup.blog.models.Product;

public interface ProductRepository extends PostRepository{
    void save(Product product);
}
