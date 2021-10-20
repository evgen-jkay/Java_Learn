package com.books.HeadFirstJava;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);

        System.out.println("First dog: " + one.getSize());
        one.bark();
    }

}
