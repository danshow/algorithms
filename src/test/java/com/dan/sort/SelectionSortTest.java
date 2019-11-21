package com.dan.sort;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    @Test
    public void testSort() {
//                int arr[] = {5, 3, 1, 76, 2, 0, 10, 8, 11, 5, 111, 7};
        int arr[] = {2};
//        int arr[]={};
        SelectionSort.sort(arr);

        Arrays.stream(arr).forEach(item -> System.out.print(item + " "));
    }
}
