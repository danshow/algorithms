package com.dan.sort;

import com.dan.util.CommonUtil;

import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort {

    public static int[] sort(int[] arr) {
        int out = arr.length;
        for (int i = out; i>0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    CommonUtil.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {
//        int arr[] = {5, 3, 1, 76, 2, 0, 10, 8, 11, 5, 111, 7};
//        int arr[]={2};
        int arr[]={};
        sort(arr);

        Arrays.stream(arr).forEach(item -> System.out.print(item + " "));
    }
}
