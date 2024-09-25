package com.practice.coding;

public class QueueByArray {
    private int[] arr;
    private int maxSize;
    private int front;
    private int back;
    private int currentSize;

    public QueueByArray(int maxSize){
        this.arr = new int[maxSize];
        this.maxSize = maxSize;
        this.front = 0;
        this.back = -1;
        this.currentSize = 0;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }

    public int top(){
        if(!isEmpty())
            return arr[back];
        else
            return -1;
    }

    public void enqueue(int item){
        if(isFull()){
            return;
        } else {
            back = (back+1) % maxSize;
            arr[back] = item;
            currentSize++;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }else {
            int item = arr[front];
            front = (front+1) % maxSize;
            currentSize--;
            return item;
        }
    }

    public static void main(String[] args) {
        QueueByArray queue = new QueueByArray(5);
        //equeue 2 4 6 8 10 at the end
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
        //dequeue 2 elements from the start
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //enqueue 12 and 14 at the end
        queue.enqueue(12);
        queue.enqueue(14);

        System.out.println("Queue:");
        while(!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }
    }

}
