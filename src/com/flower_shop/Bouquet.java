package com.flower_shop;

public class Bouquet {
    Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public double getPrice() {
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.price;
        }
        return price;
    }
}
