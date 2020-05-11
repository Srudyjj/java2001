package com.fruit_shop;

public abstract class Fruit {

    double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract double getPrice();

    public static double totalPrice(Fruit... fruits) {
        double total = 0;
        for (Fruit fruit : fruits) {
            total += fruit.getPrice();
        }
        return total;
    }

}
