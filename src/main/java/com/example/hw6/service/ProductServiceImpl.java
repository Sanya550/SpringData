package com.example.hw6.service;

import com.example.hw6.entity.Product;
import com.example.hw6.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findById(long id) {
        return productRepository.getById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        saveProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
}
