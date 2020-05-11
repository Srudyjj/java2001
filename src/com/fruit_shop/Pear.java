package com.fruit_shop;

public class Pear extends Fruit {

    public final double pricePerKg = 30.5;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    double getPrice() {
        return weight * pricePerKg;
    }
}
