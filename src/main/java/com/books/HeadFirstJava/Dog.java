package com.books.HeadFirstJava;

public class Dog {

    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Гав Гав");
        } else if (size > 14) {
            System.out.println("Буф Буф");
        } else {
            System.out.println("Тяв Тяв");
        }
    }

}
