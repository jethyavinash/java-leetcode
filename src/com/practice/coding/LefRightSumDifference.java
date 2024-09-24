package com.practice.coding;

import java.util.Arrays;

public class LefRightSumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 1};
        int[] diffArr = leftRightDifArr(arr);
        System.out.println(Arrays.toString(diffArr));
    }

    private static int[] leftRightDifArr(int[] arr) {
        int[] diffArr = new int[arr.length];
        int leftSum = 0;
        int rightSum = 0;
        for(int i =0;i<arr.length;i++){
            rightSum += arr[i];
        }

        for(int i = 0; i < arr.length ; i++){
            rightSum -= arr[i];
            diffArr[i] = Math.abs(leftSum-rightSum);
            leftSum+=arr[i];
        }
        return diffArr;
    }
}
