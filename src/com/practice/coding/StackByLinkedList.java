package com.practice.coding;

public class StackByLinkedList<T> {
    private Node<T> top;
    public static class Node<T> {
        private T item;
        private Node<T> next;
        private Node(T item){
            this.item = item;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T item){
        Node<T> node = new Node<>(item);
        node.next = top;
        top = node;

    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!");
        }
        T item = top.item;
        top = top.next;
        return item;
    }

    public T peek() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty");
        return top.item;
    }

    public static void main(String[] args) throws Exception {
        // Create a stack
        StackByLinkedList<Integer> stack = new StackByLinkedList();

        // Push elements to the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek the top element
        System.out.println("\nPeek top element: " + stack.peek()); // Output: Top element is: 30

        // Pop an element
        System.out.println("\nPopping element: " + stack.pop()); // Output: 30 popped from stack.

        // Pop another element
        System.out.println("\nPopping element: " + stack.pop()); // Output: 20 popped from stack.

        // Check if the stack is empty
        System.out.println("\nIs stack empty? " + stack.isEmpty()); // Output: false

        // Pop the last element
        System.out.println("\nPopping element: " + stack.pop()); // Output: 10 popped from stack.
        stack.peek(); // Output: Stack is empty.

        // Check if the stack is empty
        System.out.println("\nIs stack empty? " + stack.isEmpty()); // Output: true

        // Try popping from an empty stack
        System.out.println("\nTrying to pop from an empty stack:");
        stack.pop(); // Output: Stack Underflow
    }
    }

