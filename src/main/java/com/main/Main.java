package com.main;

import com.examlple.algorithm.sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] item = {20, 18, 21, 12, 23, 6, 7, 4, 9};

        System.out.println(Arrays.toString(quickSort.sort(item)));
    }
}
