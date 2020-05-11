package com.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(50);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());

        Circle circle2 = new Circle(1);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());
    }
}
