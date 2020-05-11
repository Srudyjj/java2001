package com.circle;

public class Circle {
    public static final double PI = Math.PI;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public  double getCircumference() {
        return 2 * PI * radius;
    }
}
