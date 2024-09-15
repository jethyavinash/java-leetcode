package com.practice.coding;

import java.util.Arrays;

public class ArrayRunningSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 6};
        int[] result = runningSum(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] runningSum(int[] arr) {
        int[] result = new int[arr.length];
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            result[i]=sum;
        }
        return result;
    }
}
