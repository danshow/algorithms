package com.dan.sort;

public class InsertionSort {


    public static int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int idx = i;
            for (int j = i - 1; j > 0; j--) {
                if (arr[j] > arr[idx]) {
                    arr[j] = arr[j + 1];
                } else {
                    arr[j] = arr[idx];
                }
            }
        }
        return arr;

    }
}
