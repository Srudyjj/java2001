package com.flower_shop;

public class Flower {

    private static int quantity;

    protected String producerCountry;
    protected int storageLife;
    protected double price;

    protected Flower(String producerCountry, int storageLife, double price) {
        this.producerCountry = producerCountry;
        this.storageLife = storageLife;
        this.price = price;
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }
}
