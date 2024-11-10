package com.practice.coding.heap;

public class MaxHeap {
    private int[] heap;
    private int currSize;
    private int maxSize;

    public MaxHeap(int maxSize){
        this.maxSize = maxSize;
        this.heap = new int[maxSize+1];
        currSize = 0;
        heap[0] = Integer.MAX_VALUE;
    }

    public void insert(int element){
        if(currSize >= maxSize){
            return;
        }

        heap[++currSize] = element;
        int currPointer = currSize;

        while (heap[currPointer] > heap[parentOf(currPointer)]){
            swapWithParent(currPointer,parentOf(currPointer));
            currPointer = parentOf(currPointer);
        }
    }

    private void swapWithParent(int currPointer, int parentOf) {
        int temp = heap[currPointer];
        heap[currPointer] = heap[parentOf];
        heap[parentOf] = temp;
    }

    private int parentOf(int currPointer) {
        return currPointer/2;
    }

    public void printHeap(){
        for(int i = 1; i <= currSize; i++ ){
            System.out.print(heap[i]+ " ");
        }
    }

    public static void main(String[] args) {
        MaxHeap minHeap = new MaxHeap(7);
        minHeap.insert(15);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);

        minHeap.printHeap();
    }
}
