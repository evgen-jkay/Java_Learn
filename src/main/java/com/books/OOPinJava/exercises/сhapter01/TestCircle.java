package com.books.OOPinJava.exercises.сhapter01;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "синий");
        System.out.println("Радиус = " + c1.getRadius() + " Цвет - " + c1.getColor() + " Площадь = " + c1.getArea());
        System.out.println(c1.toString());
    }
}
