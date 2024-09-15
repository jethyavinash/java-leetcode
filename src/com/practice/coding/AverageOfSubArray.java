package com.practice.coding;

import java.util.Arrays;

public class AverageOfSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        double[] result = findAverageOfSubArray(arr,5);
        System.out.println(Arrays.toString(result));
    }

    private static double[] findAverageOfSubArray(int[] arr,int k) {
        double[] result = new double[arr.length-k+1];
        double windowSum = 0;
        int windowStart = 0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum = windowSum+arr[windowEnd];
            if(windowEnd >= k-1){
                result[windowStart] = windowSum/k;

                windowSum=windowSum-arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}
