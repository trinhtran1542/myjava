package com.shoppingcart.controllers;

import com.shoppingcart.models.Product;
import com.shoppingcart.services.ProductService;

import java.util.List;

public class ProductController {
    private final ProductService productService = new ProductService();

    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    public Product getProductByName(String name) {
        return productService.findByName(name);
    }

    public List<Product> getProductsByCategoryId(int categoryId) {
        return productService.findByCategoryId(categoryId);
    }

    public void addProduct(Product product) {
        productService.save(product);
    }
}
