package com.practice.coding.pattern.warmup;

import java.util.HashMap;
import java.util.Map;

public class GoodPair {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int goodPairCount = goodPairs(nums);
        System.out.println(goodPairCount);
    }

    private static int goodPairs(int[] nums){
        int pairCount = 0;
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i : nums){
             countMap.put(i, countMap.getOrDefault(i,0 )+1);
             pairCount += countMap.get(i) - 1;
        }
        return pairCount;
    }

}
