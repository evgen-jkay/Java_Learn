package com.examlple.algorithm.sorting;

import java.util.*;

/**
 * Алгоритм быстрой сортировки
 */
public class QuickSort {
     void doSort(int[] items, int fst, int lst) {
        if (fst >= lst)
        return;
        int i = fst;
        int j = lst;
        int x = items[(fst + lst)/2];

        while (i < j) {
            while (items[i] < x) i++;
            while (items[j] > x) j--;
            if (i <= j) {
                int tmp = items[i];
                items[i] = items[j];
                items[j] = tmp;
                i++;
                j--;
            }
       }
       doSort(items, fst, j);
       doSort(items, i, lst);
    }

    int[] sort(int[] arr)
    {
        int len = arr.length;
        int[] items = Arrays.copyOf(arr, len);
        doSort(items, 0, len - 1);
        return items;
    }
}
