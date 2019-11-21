package com.dan.sort;

import com.dan.util.CommonUtil;

public class SelectionSort {

    public static  int[] sort(int[] arr) {

        for (int out = 0; out < arr.length; out++) {
            int min = out;
            for (int i = out + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            CommonUtil.swap(arr, out, min);
        }
        return arr;
    }


}
