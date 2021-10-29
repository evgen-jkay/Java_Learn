package com.books.HeadFirstJava.example;

public class Animal {
    public void makeNoise() {
        System.out.println("makeNoise");
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep" + getClass().getName());
    }

    public void roam() {
        System.out.println("roam");
    }
}
