package com.shoppingcart;

import com.shoppingcart.controllers.CategoryController;
import com.shoppingcart.controllers.ProductController;
import com.shoppingcart.models.Category;
import com.shoppingcart.models.Product;

import java.util.List;

public class Main {
    private static final CategoryController categoryController = new CategoryController();
    private static final ProductController productController = new ProductController();

    public static void main(String[] args) {
        initializeData();

        // Lấy ra tất cả category
        System.out.println("All Categories:");
        for (Category category : getAllCategories()) {
            System.out.println(category);
        }

        // Lấy ra category theo name
        String categoryName = "laptops";
        System.out.println("\nCategory by name (" + categoryName + "):");
        System.out.println(getCategoryByName(categoryName));

        // Lấy ra tất cả product
        System.out.println("\nAll Products:");
        for (Product product : getAllProducts()) {
            System.out.println(product);
        }

        // Lấy ra product theo name
        String productName = "Laptop A";
        System.out.println("\nProduct by name (" + productName + "):");
        System.out.println(getProductByName(productName));

        // Lấy ra tất cả product theo category_id
        int categoryId = 1;
        System.out.println("\nProducts by category_id (" + categoryId + "):");
        for (Product product : getProductsByCategoryId(categoryId)) {
            System.out.println(product);
        }
    }

    private static void initializeData() {
        // Initialize categories
        Category laptops = new Category(1, "laptops");
        Category phones = new Category(2, "phones");
        categoryController.addCategory(laptops);
        categoryController.addCategory(phones);

        // Initialize products for laptops
        productController.addProduct(new Product(1, "Laptop A", 1000.0, 1));
        productController.addProduct(new Product(2, "Laptop B", 1500.0, 1));
        productController.addProduct(new Product(3, "Laptop C", 2000.0, 1));
        productController.addProduct(new Product(4, "Laptop D", 2500.0, 1));
        productController.addProduct(new Product(5, "Laptop E", 3000.0, 1));
        productController.addProduct(new Product(6, "Laptop F", 3500.0, 1));
        productController.addProduct(new Product(7, "Laptop G", 4000.0, 1));
        productController.addProduct(new Product(8, "Laptop H", 4500.0, 1));
        productController.addProduct(new Product(9, "Laptop I", 5000.0, 1));
        productController.addProduct(new Product(10, "Laptop J", 5500.0, 1));

        // Initialize products for phones
        productController.addProduct(new Product(11, "Phone A", 600.0, 2));
        productController.addProduct(new Product(12, "Phone B", 700.0, 2));
        productController.addProduct(new Product(13, "Phone C", 800.0, 2));
        productController.addProduct(new Product(14, "Phone D", 900.0, 2));
        productController.addProduct(new Product(15, "Phone E", 1000.0, 2));
        productController.addProduct(new Product(16, "Phone F", 1100.0, 2));
        productController.addProduct(new Product(17, "Phone G", 1200.0, 2));
        productController.addProduct(new Product(18, "Phone H", 1300.0, 2));
        productController.addProduct(new Product(19, "Phone I", 1400.0, 2));
        productController.addProduct(new Product(20, "Phone J", 1500.0, 2));
    }

    public static List<Category> getAllCategories() {
        return categoryController.getAllCategories();
    }

    public static Category getCategoryByName(String name) {
        return categoryController.getCategoryByName(name);
    }

    public static List<Product> getAllProducts() {
        return productController.getAllProducts();
    }

    public static Product getProductByName(String name) {
        return productController.getProductByName(name);
    }

    public static List<Product> getProductsByCategoryId(int categoryId) {
        return productController.getProductsByCategoryId(categoryId);
    }
}
