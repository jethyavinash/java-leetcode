package com.practice.coding;

public class StackUsingLinkedList<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> top;

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() throws Exception{
        if(top == null)
            throw new Exception("Stack is Empty");
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() throws Exception{
     if(top == null)
         throw new Exception("Stack is Empty");

     return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String[] args) throws Exception{
        StackUsingLinkedList<Integer> stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(4);

        System.out.println(stackUsingLinkedList.peek());
        System.out.println(stackUsingLinkedList.peek());
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
    }
}
