package com.practice.coding.pattern.TopKNumber;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthSmallesNumber {
    public static void main(String[] args) {
        int[] inputs = {1,2,4,6,7,8,9};
        int K = 5;
        int kthSmallestNum = findKthSmallestNum(inputs,K);
        System.out.println(kthSmallestNum);
    }

    private static int findKthSmallestNum(int[] inputs,int K){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i< inputs.length;i++){
            maxHeap.offer(inputs[i]);
            if(maxHeap.size() > K){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
