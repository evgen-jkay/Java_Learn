package com.books.HeadFirstJava.example.oop;

public class Dog extends Canine implements Pet, Pet2 {
    public Dog(String theName) {
        super(theName);
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }

    @Override
    public void roam() {
        super.roam();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void pet2() {

    }
}
