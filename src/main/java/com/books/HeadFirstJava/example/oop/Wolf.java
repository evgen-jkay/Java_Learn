package com.books.HeadFirstJava.example.oop;

public class Wolf extends Canine {
    public Wolf(String theName) {
        super(theName);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println("eat Wolf");
    }

}