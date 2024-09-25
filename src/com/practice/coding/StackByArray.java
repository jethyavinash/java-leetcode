package com.practice.coding;

public class StackByArray <V> {
    private int maxSize;
    private int top;
    private V[] arr;

    public StackByArray(int size){
        this.maxSize = size;
        this.top = -1;
        this.arr = (V[])new Object[size];
    }

    public boolean isEmpty(){
        if(this.top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        return this.top == this.maxSize - 1;
    }
    public int geMaxSize(){
        return this.maxSize;
    }

    public V top(){
        if(isEmpty())
            return null;
        return this.arr[top];
    }

    public void push(V item) throws Exception{
        if(isFull())
            throw new Exception("Stack is Full");

        this.arr[++top] = item;
    }

    public V pop() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return this.arr[top--];

    }

}
