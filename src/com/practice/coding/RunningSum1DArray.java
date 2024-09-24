package com.practice.coding;

import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int[] sumArr = runningSum2(arr);
        System.out.println("After running sum: "+ Arrays.toString(sumArr));
    }

    private static int[] runningSum(int[] arr) {
        int[] sumArr = new int[arr.length];
        int sum = 0;
        for(int i = 0 ;i < arr.length; i++){
            sum = sum + arr[i];
            sumArr[i] = sum;
        }
        return sumArr;
    }

    private static int[] runningSum2(int[] arr){
        int[] sumArr = new int[arr.length];

        sumArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            sumArr[i] = sumArr[i-1] + arr[i];
        }
        return sumArr;
    }
}
