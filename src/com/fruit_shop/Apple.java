package com.fruit_shop;

public class Apple extends Fruit {

    public final double pricePerKg = 25.5;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    double getPrice() {
        return weight * pricePerKg;
    }
}
