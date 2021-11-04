package com.books.OOPinJava.exercises.сhapter01;

public class Circle {

    private double radius;
    private String color;
    
    public Circle() {
        radius = 1.0;
        color = "красный";
    }
    
    public Circle(double r) {
        radius = r;
        color = "красный";
    }
    
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Круг радиуса = " + radius + " и цвета " + color;
    }
}
