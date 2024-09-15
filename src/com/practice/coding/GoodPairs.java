package com.practice.coding;

import java.util.HashMap;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1 };
        int result = numGoodPairs(nums);
        System.out.println(result);

    }

    private static int numGoodPairs(int[] nums) {
        HashMap<Integer,Integer> tracker = new HashMap<>();
        int countPairs = 0;
        for(int num:nums){
            tracker.put(num,tracker.getOrDefault(num,0)+1);
            countPairs = countPairs+(tracker.get(num)-1);
        }
        return countPairs;
    }
}
