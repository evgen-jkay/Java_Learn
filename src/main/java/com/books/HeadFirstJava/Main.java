package com.books.HeadFirstJava;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(3);
        listOfNumbers.add(7);
        listOfNumbers.add(5);
        int num = listOfNumbers.get(0);

        System.out.println(listOfNumbers);
        for (int listOfNumber : listOfNumbers) {
            System.out.println(listOfNumber);
        }
    }
}
