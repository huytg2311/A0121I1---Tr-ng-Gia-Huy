package com.codegym;

public class Circle {
    private double radius = 1.0;
    public String name = "red";
    private double result;

    public Circle() {}

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return result = this.radius * this.radius * Math.PI;
    }
}
