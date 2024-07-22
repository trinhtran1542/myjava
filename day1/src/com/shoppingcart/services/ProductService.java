package com.shoppingcart.services;

import com.shoppingcart.models.Product;
import com.shoppingcart.repos.ProductRepository;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> findByCategoryId(int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public void save(Product product) {
        productRepository.save(product);
    }
}
