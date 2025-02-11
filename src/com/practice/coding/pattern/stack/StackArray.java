package com.practice.coding.pattern.stack;

public class StackArray {
    private int[] arr;
    private int top;

    public StackArray(int size){
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int item){
        if(isFull())
            return;
        arr[++top] = item;
    }

    public int pop(){
        if(isEmpty())
            return -1;
        return arr[top--];
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return arr[top];
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == arr.length - 1;
    }

    public void display(){
        for(int i = 0;i<=top;i++){
            System.out.print(arr[i] + " ,");
        }
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.pop();
        stackArray.display();
        System.out.println("\n=====================");
        System.out.println(stackArray.peek());
    }
}
