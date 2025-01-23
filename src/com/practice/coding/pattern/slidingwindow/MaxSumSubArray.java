package com.practice.coding.pattern.slidingwindow;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 3;
        int result = maxSumBrute(arr,K);
        System.out.println("result: "+result);
    }

    private static int maxSum(int[] arr,int K){
        int windowSum = 0;
        int maxSum = 0;
        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < arr.length ; windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd >= K-1){
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }

    private static int maxSumBrute(int[] arr,int K){
        int maxSum = 0;
        for(int i = 0;i< arr.length - K + 1;i++){
            int sum = 0;
            for(int j = i;j < K+i;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
