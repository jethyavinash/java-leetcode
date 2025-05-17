package com.practice.coding.pattern.prefix;

public class RangeSumUsingPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] prefixSumArr = findPrefixSumArr(arr);
        int rangeSum = findRangeSum(prefixSumArr,1,3);
        System.out.println(rangeSum);
    }

    private static int[] findPrefixSumArr(int[] arr){
        int[] prefixSumArr = new int[arr.length];

        prefixSumArr[0] = arr[0];

        for(int i = 1;i < arr.length ; i++){
            prefixSumArr[i] = prefixSumArr[i-1] + arr[i];
        }

        return prefixSumArr;
    }

    private static int findRangeSum(int[] prefixSumArr, int i , int j){
        if(i==0) return prefixSumArr[j];

        return prefixSumArr[j] - prefixSumArr[i-1];
    }
}
