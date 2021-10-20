package com.books.HeadFirstJava;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog one = new Dog();
        Dog two = new Dog();
        one.setSize(70);
        two.setSize(8);

        System.out.println("First dog: " + one.getSize());
        System.out.println("Second dog: " + two.getSize());
        one.bark();
        two.bark();
    }

}
