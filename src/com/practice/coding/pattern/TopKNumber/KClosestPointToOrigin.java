package com.practice.coding.pattern.TopKNumber;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] points = { {0, 0}, {2, 2}, {3, 3} };
        int K = 1;
        int[][] KClosest = findKClosestPoint(points,K);
        for (int[] point : KClosest){
            System.out.println(Arrays.toString(point));
        }
    }

    private static int[][] findKClosestPoint(int[][] points, int K){
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b) -> sqrDistance(b) - sqrDistance(a));
        for (int[] point : points){
            maxheap.offer(point);
            if(maxheap.size() > K){
                maxheap.poll();
            }
        }

        int[][] result = new int[K][2];
        for(int i = 0 ;i< K;i++){
            result[i] = maxheap.poll();
        }
        return result;
    }

    private static int sqrDistance(int[] point){
        return point[0]*point[0] * point[1]*point[1];
    }
}
