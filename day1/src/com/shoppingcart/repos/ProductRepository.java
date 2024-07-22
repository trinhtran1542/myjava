package com.shoppingcart.repos;

import com.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products = new ArrayList<Product>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return new ArrayList<Product>(products);
    }

    public Product findByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findByCategoryId(int categoryId) {
        List<Product> result = new ArrayList<Product>();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getCategoryId() == categoryId) {
                result.add(product);
            }
        }
        return result;
    }
}
