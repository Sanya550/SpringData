package com.example.hw6.controller;


import com.example.hw6.entity.Product;
import com.example.hw6.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/findByIdProduct/{id}")
    public ResponseEntity<Product> findByIdentif(@PathVariable("id") long id) {
        Product product = productService.findById(id);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

    @PostMapping(value = "/createProduct")
    public void create(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PutMapping(value = "/updateProduct")
    public void update(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping(value = "/deleteProduct")
    public void delete(@RequestBody Product product) {
        productService.deleteProduct(product);
    }
}

