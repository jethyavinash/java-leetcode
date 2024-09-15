package com.practice.coding;

public class SmallestSubArrayWithGreaterValue {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2 };
        int target = 7;
        int result = findSmallestSubArray(arr,target);
        System.out.println(result);
    }

    private static int findSmallestSubArray(int[] arr, int target) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int windowSum = 0;

        for(;windowEnd<arr.length;windowEnd++){
            windowSum = windowSum + arr[windowEnd];
            if(windowSum>=target){
                minLength = Math.min(minLength,((windowEnd-windowStart)+1));
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
