package com.example;

import java.util.Scanner;


public class FahrenheitToCentigrade {
    public static void main(String[] args) {
        float fah;
        double cel;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit: ");
        fah = scan.nextFloat();

        cel = (fah - 32) / 1.8;

        System.out.println("Equivalent Temperature of " + fah + "in Celsius = " + cel);
    }
}
