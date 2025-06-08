package com.practice.coding.pattern.counting;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencySum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3,3, 2,1, 4};
        int maxFeq = findMaxFreqOutOfAll(nums);
        System.out.println(maxFeq);
    }

    private static int findMaxFreqOutOfAll(int[] nums){
        Map<Integer,Integer> numToFreqMap = new HashMap<>();
        int maxFreq = 0;
        int totalFreq =  0;
        for(int num : nums){
            int freq = numToFreqMap.getOrDefault(num, 0) + 1;
            numToFreqMap.put(num, freq);
            maxFreq = Math.max(maxFreq,freq);
        }

        for(int freq : numToFreqMap.values()){
            if(freq == maxFreq){
                totalFreq += freq;
            }
        }
        return totalFreq;
    }
}
