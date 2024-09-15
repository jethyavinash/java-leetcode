package com.practice.coding;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4, 6};
        int target = 6;
        int[] result = findPair1(inputArr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findPair1(int[] inputArr, int target) {
        int left = 0;
        int right = inputArr.length-1;
        while (right>left){
            int sum = inputArr[left] + inputArr[right];
            if(sum == target){
                return new int[]{left,right};
            }
            if(sum > target)
                right--;
            if(sum<target)
                left++;

        }
        return new int[]{-1,-1};
    }
}
