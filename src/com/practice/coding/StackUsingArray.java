package com.practice.coding;

public class StackUsingArray {
    public static void main(String[] args) throws Exception {
        StackImpl<String> stackString = new StackImpl<>(5);
        stackString.push("gggg");
        stackString.push("yyy");
        stackString.push("jjj");
        stackString.push("ddd");
        stackString.push("ppp");

        System.out.println(stackString.peek());
        System.out.println(stackString.pop());
        System.out.println(stackString.peek());


    }
}

class Stack<T>{
    int top;
    Object[] stack;

    public Stack(int size) {
        this.top = -1;
        this.stack = new Object[size];
    }

    public void push(T element) throws Exception {
        if(top == stack.length-1){
            throw new Exception("stack overflow");
        }
        stack[++top] =(T) element;
    }
    public T pop() throws Exception {
        if(isEmpty()){
            throw new Exception("stack underflow");
        }
        T element = (T)stack[top];
        stack[top--] = null;
        return element;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public T peek() throws Exception {
        if(isEmpty()){
            throw new Exception("stack underflow");
        }
        return (T)stack[top];
    }

}
