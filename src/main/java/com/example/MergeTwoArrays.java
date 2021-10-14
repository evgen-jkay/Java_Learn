package com.example;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arrays1 = {10, 20, 30};
        int[] arrays2 = {100, 200, 300};

        int[] merge = new int[arrays1.length + arrays2.length];
        for (int i = 0; i < arrays1.length ; i++) {
            merge[i] = arrays1[i];
        }
        for (int i = 0; i < arrays2.length; i++) {
            merge[i + arrays1.length] = arrays2[i];
        }

        System.out.println(Arrays.toString(merge));
    }
}
