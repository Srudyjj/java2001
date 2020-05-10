package com.zoo;

public class Cat extends Animal {

    public final String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
}
