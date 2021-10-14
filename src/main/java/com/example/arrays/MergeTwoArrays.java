package com.example.arrays;

import java.util.Arrays;


public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arrays1 = {10, 20, 30};
        int[] arrays2 = {100, 200, 300};
        int[] arrays3 = {50, 60, 70};
        int[] arrays4 = {500, 600, 700};

        int[] merge = new int[arrays1.length + arrays2.length];

        // Вариант 1:
        for (int i = 0; i < arrays1.length; i++) {
            merge[i] = arrays1[i];
        }
        for (int i = 0; i < arrays2.length; i++) {
            merge[i + arrays1.length] = arrays2[i];
        }
        System.out.println(Arrays.toString(merge));

        // Вариант 2:
        System.arraycopy(arrays3, 0, merge, 0, arrays3.length);
        System.arraycopy(arrays4, 0, merge, arrays3.length, arrays4.length);
        System.out.println(Arrays.toString(merge));
    }
}
