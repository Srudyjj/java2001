package com.zoo;

public class Horse extends Animal {

    public final String name;

    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
}
