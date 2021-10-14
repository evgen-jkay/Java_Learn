package com.example.arrays;

public class CalculateAverageExample {
    public static void main(String[] args) {
        int[] numbers = new int[] {22, 20, 41, 55, 16, 60, 100};

        int sum = 0;

        /* Вариант 1: */
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        /*
         * Вариант 2:
         *
         * for (int i = 0; i < numbers.length; i++) {
         *    sum2 += numbers[i];
         * }
         */

        /*
         * Вариант 3:
         *
         * for (int number : numbers) sum3 += number;
         */

        System.out.println(sum);

        float average = sum / numbers.length;

        System.out.println("Average is: " + average);
    }
}
