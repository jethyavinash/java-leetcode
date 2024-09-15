package com.practice.coding;

public class StackTwoStack {
    private int[] arr;
    private int top1,top2;

    public StackTwoStack() {
        this.arr = new int[100];
        this.top1 = -1;
        this.top2 = arr.length;
    }

    public void push1(int element) throws Exception {
        if(top2 > top1){
            arr[++top1] = element;
        }else {
            throw new Exception("stack overflow 1");
        }
    }

    public void push2(int element) throws Exception{
        if(top2 > top1){
            arr[--top2] = element;
        }else {
            throw new Exception("stack overflow 2");
        }
    }

    public int pop1() throws Exception {
        if(top1 > 0){
            int element = arr[top1];
            top1--;
            return element;
        }else {
            throw new Exception("Stack underflow 1");
        }
    }

    public int pop2() throws Exception {
        if(top2 < arr.length){
            int element = arr[top2];
            top2++;
            return element;
        }else {
            throw new Exception("Stack underflow 1");
        }
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        StackTwoStack stack = new StackTwoStack();
        stack.push1(1);
        stack.push1(2);
        stack.push2(3);
        stack.push2(4);

        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
    }
}
