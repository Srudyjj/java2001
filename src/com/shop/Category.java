package com.shop;

public class Category {
    private long id;
    private String name;
    private Product[] products;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public Product getProduct(long id) {
        Product product = null;
        for (Product p: this.products) {
            if (p.getId() == id) {
                product = p;
                break;
            }
        }
        return product;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Category(long id, String name, Product[] products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }
}
