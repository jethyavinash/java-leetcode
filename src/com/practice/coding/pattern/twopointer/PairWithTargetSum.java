package com.practice.coding.pattern.twopointer;

import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 6};
        int target = 100;
        int[] pair = findPairWithTargetSum(inputArr,target);
        System.out.println(Arrays.toString(pair));
    }

    private static int[] findPairWithTargetSum(int[] inputArr,int target){
        Arrays.sort(inputArr);
        int start = 0;
        int end = inputArr.length-1;
        while (start < end){
            if(inputArr[start]+inputArr[end] == target){
                return new int[]{start,end};
            }else if(inputArr[start]+inputArr[end] > target){
                end--;
            }else if(inputArr[start]+inputArr[end] < target){
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
