package com.practice.coding;

import java.util.Arrays;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 1, 3, 2};
        double result = findMaxOfSubArray(arr,3);
        System.out.println(result);
    }

    private static double findMaxOfSubArray(int[] arr,int k) {

        
        double maxSum = 0;
        double windowSum = 0;
        int windowStart = 0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum = windowSum+arr[windowEnd];
            if(windowEnd >= k-1){
                if(maxSum<windowSum){
                    maxSum=windowSum;
                }
                windowSum=windowSum-arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
