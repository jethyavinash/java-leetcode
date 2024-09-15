package com.practice.coding;

import java.util.HashMap;

public class MaxInHashMap {
    public static void main(String[] args) {
        int[] nums = {9, 9, 8, 8, 7, 7};
        int result = findLargestUnique(nums);
        System.out.println(result);
    }

    private static int findLargestUnique(int[] nums) {
        int result = -1;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for (int key: freq.keySet()){
            if(freq.get(key) == 1){
                result = Math.max(key,result);
            }
        }
        return result;

    }
}
