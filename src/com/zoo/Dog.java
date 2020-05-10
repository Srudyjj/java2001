package com.zoo;

public class Dog extends Animal {

    public final String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
}
