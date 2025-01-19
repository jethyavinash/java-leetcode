package com.practice.coding.pattern.slidingwindow;

import java.util.Arrays;

public class SlidingWindowAverage {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int K = 5;
        double[] avgArr = avgWindowBruteForce(arr,K);
        System.out.println(Arrays.toString(avgArr));
        System.out.println("-----------------------");
        double[] avgArr2 = avgWinfowSliding(arr,K);
        System.out.println(Arrays.toString(avgArr2));
    }

    private static double[] avgWindowBruteForce(int[] arr,int K){
        double[] result = new double[arr.length - K + 1];
        for (int i = 0; i < arr.length - K + 1 ; i++){
            double sum = 0;
            for(int j = i;j < K + i ; j++){
                sum += arr[j];
            }
            result[i] = sum/K;
        }
        return result;
    }

    private static double[] avgWinfowSliding(int[] arr,int K){
        double[] result = new double[arr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < arr.length ; windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd >= K-1){
                result[windowStart] = windowSum / K;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}
