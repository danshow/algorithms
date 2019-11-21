package com.dan.data.structure;

import java.util.Arrays;

public class Stack {
    private int[] data;
    private int top;
    private Stack(int size){
        top=0;
        data=new int[size];
    }

    public int pop()throws  Exception{
        if(top==0){
            throw new Exception("Stack is empty");
        }
        return data[top--];
    }
    public int peek(){
        return data[top];
    }
    public void push(int val)throws Exception{
        if(top==data.length){
           throw new Exception("stack is full!");
        }
        data[top++]=val;
    }
    public  void display(){
        Arrays.stream(data).forEach(item->System.out.print(item+" "));
    }
    public static void main(String[] args)throws Exception {
        Stack stack=new Stack(5);
        stack.push(1);
        stack.display();
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.push(4);
        stack.push(5);
        stack.display();
//        stack.push(6);
    }
}
