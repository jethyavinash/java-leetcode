package com.practice.coding.pattern.TopKNumber;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        int[] ropes = new int[]{1,2,3,7};
        int minCOst = findMinCostToConnect(ropes);
        System.out.println(minCOst);
    }

    private static int findMinCostToConnect(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < ropes.length;i++){
            pq.add(ropes[i]);
        }

        int minCost = 0;
        while(pq.size() > 1){
            int firstRope = pq.poll();
            int secondRope = pq.poll();
            int cost = firstRope+secondRope;
            minCost+=cost;
            pq.add(cost);
        }
        return minCost;
    }
}
