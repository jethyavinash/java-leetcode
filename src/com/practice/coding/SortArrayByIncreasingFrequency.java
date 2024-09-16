package com.practice.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        Integer[] nums = {4, 4, 6, 2, 2, 2};
        System.out.println(Arrays.toString(frequencySort(nums))); // [6, 4, 4, 2, 2, 2]
    }

    private static Integer[] frequencySort(Integer[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        Arrays.sort(nums,(a,b) -> {
                int freqA = freqMap.get(a);
                int freqB = freqMap.get(b);
                if(freqA == freqB){
                    return Integer.compare( b, a);
                }else {
                    return Integer.compare(freqA,freqB);
                }
        });
        return nums;
    }
}
