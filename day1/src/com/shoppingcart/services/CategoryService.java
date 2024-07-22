package com.shoppingcart.services;

import com.shoppingcart.models.Category;
import com.shoppingcart.repos.CategoryRepository;

import java.util.List;

public class CategoryService {
    private final CategoryRepository categoryRepository = new CategoryRepository();

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }
}
