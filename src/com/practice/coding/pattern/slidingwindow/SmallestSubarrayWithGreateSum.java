package com.practice.coding.pattern.slidingwindow;

public class SmallestSubarrayWithGreateSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int K = 7;
        int smallestLen = smallestSubArray(K,arr);
        System.out.println(smallestLen);
    }

    private static int smallestSubArray(int K,int[] arr){
        int windowSum = 0;
        int windowStart = 0;
        int minLen = Integer.MAX_VALUE;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum += arr[windowEnd];

            while (windowSum >= K){
                minLen = Math.min(minLen,windowEnd-windowStart+1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLen;
    }
}
