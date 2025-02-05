package com.practice.coding.stack;

public class StackUsingLinkedList {

    private static class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList(){
        this.top = null;
    }

    public void push(int item){
        Node node = new Node(item);
        node.next = top;
        top = node;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    private boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        return top.data;
    }

    public void display(){
        if(isEmpty())
            return;

        while (top != null){
            System.out.print(top.data);
            top = top.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("---------------");
        stack.display();
        System.out.println("---------------");


    }
}
