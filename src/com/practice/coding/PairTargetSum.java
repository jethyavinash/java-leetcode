package com.practice.coding;

import java.util.Arrays;

public class PairTargetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int sum = 6;
        int[] result = findPair(arr,sum);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findPair(int[] arr, int sum) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            if(arr[start] + arr[end] == sum){
                return new int[]{start,end};
            }

            if(arr[start]+arr[end]>sum){
                end--;
            }

            if(arr[start]+arr[end] < sum){
                start++;
            }
        }
        return new int[]{-1};
    }
}
