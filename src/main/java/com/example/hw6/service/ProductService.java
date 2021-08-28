package com.example.hw6.service;

import com.example.hw6.entity.Product;

public interface ProductService {
    Product findById(long id);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);
}
