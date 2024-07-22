package com.shoppingcart.repos;

import com.shoppingcart.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    private final List<Category> categories = new ArrayList<Category>();

    public void save(Category category) {
        categories.add(category);
    }

    public List<Category> findAll() {
        return new ArrayList<Category>(categories);
    }

    public Category findByName(String name) {
        for (int i = 0; i < categories.size(); i++) {
            Category category = categories.get(i);
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }
}
