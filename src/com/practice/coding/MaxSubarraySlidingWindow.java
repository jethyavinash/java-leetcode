package com.practice.coding;

public class MaxSubarraySlidingWindow {
    public static void main(String[] args) {
        int[] inputArr = {0, 1, 1, 3, -1, 10, -2};
        int k = 3;
        double result = maxSubArray(inputArr,k);
        System.out.println("result: "+result);
    }

    public static double maxSubArray(int[] inputArray,int k){
        double maxSum = 0;
        for(int i = 0;i < k ; i++){
            maxSum+= inputArray[i];
        }
        double currSum = maxSum;

        for(int i = k;i < inputArray.length;i++){
            currSum+=inputArray[i] - inputArray[i-k];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum/k;
    }
}
