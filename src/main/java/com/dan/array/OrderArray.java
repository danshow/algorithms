package com.dan.array;


/**
 * implement interface
 * add(),delete(),find(),
 */
public class OrderArray {
    private long[] elements;
    private int index;
    private OrderArray(int nums){
        index=0;
        elements=new long[nums];
    }
    public void add(long elem){
        elements[index++]=elem;
    }
    public void delete(long num){

    }

}
