package com.practice.coding;

public class Queue<T> {
    private int size = 0;
    private Node<T> front;
    private Node<T> rear;

    private static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (front == null && rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public T dequeue() throws Exception {
        T result = null;
        if (front == null && rear == null) {
            throw new Exception("Queue underflow");
        } else if (front == rear) {
            result = front.data;
            front = rear = null;
            size--;
        } else {
            result = front.data;
            front = front.next;
            size--;

        }
        return result;
    }

    public boolean isEmpty() {
        return size == 0 ? true :false;
    }

    public T peek() {
        return front.data;
    }

    public static void main(String[] args) throws Exception {
        Queue<String> queue = new Queue<>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
