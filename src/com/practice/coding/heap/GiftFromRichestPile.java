package com.practice.coding.heap;

import java.util.PriorityQueue;

public class GiftFromRichestPile {
    public static void main(String[] args) {
        int[] gifts = new int[]{1,2,3};
        int result = remainingGifts(gifts,1);
        System.out.println(result);
    }

    private static int remainingGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int gift : gifts){
            pq.add(-gift);
        }

        for(int i=1;i<=k;i++){
            int polled = -pq.poll();
            pq.add(-(int)Math.sqrt(polled));
        }

        int sum = 0;
        while (!pq.isEmpty()){
            sum += -pq.poll();
        }
        return sum;
    }
}
