package com.shoppingcart.controllers;

import com.shoppingcart.models.Category;
import com.shoppingcart.services.CategoryService;

import java.util.List;

public class CategoryController {
    private final CategoryService categoryService = new CategoryService();

    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    public Category getCategoryByName(String name) {
        return categoryService.findByName(name);
    }

    public void addCategory(Category category) {
        categoryService.save(category);
    }
}
