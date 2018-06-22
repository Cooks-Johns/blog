package com.codeup.blog.repositories;

import com.codeup.blog.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    void save(Product product);
}
