package com.fruit_shop;

public class Apricot extends Fruit {

    public final double pricePerKg = 15.5;

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    double getPrice() {
        return weight * pricePerKg;
    }
}
