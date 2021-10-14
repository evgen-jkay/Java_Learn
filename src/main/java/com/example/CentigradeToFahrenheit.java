package com.example;

import java.util.Scanner;


public class CentigradeToFahrenheit {
    public static void main(String[] args) {
        float cen;
        double fah;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Temperature in Centigrade: ");
        cen = scan.nextFloat();

        fah = (1.8 * cen) + 32;

        System.out.println("Equivalent Temperature of " + cen + "in Fahrenheit = " + fah);
    }
}
