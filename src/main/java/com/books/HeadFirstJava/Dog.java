package com.books.HeadFirstJava;

public class Dog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav Gav");
        } else if (size > 14) {
            System.out.println("Vaf Vaf");
        } else {
            System.out.println("Taavi taavi");
        }
    }
}
