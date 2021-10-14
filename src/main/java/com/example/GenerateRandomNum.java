package com.example;

import java.util.Random;


public class GenerateRandomNum {
    public static void main(String[] args) {
        int counter;

        Random rNum = new Random();

        /**
         * Below code would generate 10 random numbers
         * between 0 and 100
         */

        System.out.println("Random Numbers Generated Below:");

        for (counter = 1; counter <= 10; counter++) System.out.println(rNum.nextInt(100));
    }
}
