package com.shop;

public class Basket {
    private final Product[] products;
    private int position = 0;

    public Basket() {
        this.products = new Product[100];
    }

    public void add(Product product) {
        this.products[position++] = product;
    }

    public Product[] getProducts() {
        return this.products;
    }
}
