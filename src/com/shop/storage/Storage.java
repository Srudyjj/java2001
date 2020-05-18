package com.shop.storage;

import com.shop.Basket;
import com.shop.Category;
import com.shop.Product;
import com.shop.User;

public class Storage {
    private final User[] users = new User[2];
    private final Category[] categories = new Category[2];

    public Storage() {
        this.users[0] = new User("user","pass", new Basket());
        this.users[1] = new User("admin", "admin", new Basket());

        this.categories[0] = new Category(1,"Vegetables", new Product[]{
                new Product(1,"Potato", 10,9),
                new Product(2,"Cucumber", 10,9),
                new Product(3,"Carrot", 10,9)
        });
        this.categories[1] = new Category(2,"Fruits", new Product[] {
                new Product(4,"Apple", 10,9),
                new Product(5,"Cherry", 10,9),
                new Product(6,"Apricot", 10,9)
        });
    }

    public Category[] getCategoryList() {
        return this.categories;
    }

    public Category getCategory(long id) {
        Category category = null;
        for (Category c: this.categories) {
            if (c.getId() == id) {
                category = c;
                break;
            }
        }
        return category;
    }
}
