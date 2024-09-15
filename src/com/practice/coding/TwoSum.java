package com.practice.coding;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,6,3,7,3,7,4,7,4};
        int target = 10;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }


    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numAndIndex = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int complement = target-nums[i];
            if(numAndIndex.containsKey(complement)){
                return new int[]{i,numAndIndex.get(complement)};
            }
            numAndIndex.put(nums[i],i);
        }
        return null;
    }
}
