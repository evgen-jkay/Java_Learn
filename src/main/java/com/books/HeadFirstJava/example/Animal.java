package com.books.HeadFirstJava.example;

public abstract class Animal {
    private String name;

    public Animal() {  }

    public Animal(String theName) {
        name = theName;
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println("makeNoise");
    }

    public void eat() {
        System.out.println("EAT!");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void roam() {
        System.out.println("roam");
    }
}
