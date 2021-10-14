package com.example.arrays;

import java.util.Arrays;


public class SortArrays {
    public static void main(String[] args) {
        int[] array = {101, 201, 10, 222};

        System.out.println("Array Elements before sort");

        for (int elem : array) {
            System.out.println(elem);
        }

        // Call Arrays.sort on the int array
        Arrays.sort(array);
        System.out.println("Array Elements after sort");
        for (int elem : array) {
            System.out.println(elem);
        }
    }
}
