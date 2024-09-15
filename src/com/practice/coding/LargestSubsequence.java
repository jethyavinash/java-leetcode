package com.practice.coding;

import java.util.Arrays;

public class LargestSubsequence {
    public static void main(String[] args) {
        int[] nums = {5, -2, 3, 8};
        int k = 2;
        Integer[] result = largestSeqArr(nums,k);
        System.out.println(Arrays.toString(result));
    }

    private static Integer[] largestSeqArr(int[] nums, int k) {
        Integer[] indexes = new Integer[nums.length];
        for(int i = 0;i<nums.length;i++){
            indexes[i] = i;
        }

        Arrays.sort(indexes,(i, j) -> nums[j] -nums[i]);
        Integer[] result = new Integer[k];
        for(int i = 0;i<k;i++){
            result[i] = nums[indexes[i]];
        }
        return result;
    }
}
