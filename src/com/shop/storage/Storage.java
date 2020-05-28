package com.shop.storage;

import com.shop.actions.structure.Basket;
import com.shop.actions.structure.Category;
import com.shop.actions.structure.Product;
import com.shop.actions.structure.User;

public class Storage {
    private final User[] users;
    private final Category[] categories;
    private final Product[] products;
    private final Basket[] baskets;

    public Storage() {
        this.users = new User[]{
                new User("user", "pass", 1),
                new User("admin", "admin", 2)
        };

        this.baskets = new Basket[]{
                new Basket(1),
                new Basket(2)
        };

        this.products = new Product[]{
                new Product(1, "Potato", 10, 9),
                new Product(2, "Cucumber", 10, 9),
                new Product(3, "Carrot", 10, 9),
                new Product(4, "Apple", 10, 9),
                new Product(5, "Cherry", 10, 9),
                new Product(6, "Apricot", 10, 9)
        };

        this.categories = new Category[]{
                new Category(1, "Vegetables", new long[]{1, 2, 3}),
                new Category(2, "Fruits", new long[]{4, 5, 6})
        };
    }

    public Basket getBasket(long id) {
        for (Basket b : this.baskets) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public Product getProduct(long id) {
        for (Product p : this.products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Category[] getCategoryList() {
        return this.categories;
    }

    public Category getCategory(long id) {
        for (Category c : this.categories) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public User getUser(String login, String password) {
        for (User u : this.users) {
            if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
}
