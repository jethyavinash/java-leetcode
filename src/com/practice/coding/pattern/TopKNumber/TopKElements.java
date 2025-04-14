package com.practice.coding.pattern.TopKNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKElements {
    public static void main(String[] args) {
        int[] input = {1,8,3,4,2,5,7};
        int k = 2;

        List<Integer> topKElem = findTopKElements(input,k);
        System.out.println(topKElem);
    }

    private static List<Integer> findTopKElements(int[] input,int K){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(K);

        for(int i = 0;i<input.length;i++){
            minHeap.add(input[i]);
            if(minHeap.size() > K){
                minHeap.poll();
            }
        }

        return new ArrayList<>(minHeap);
    }
}
