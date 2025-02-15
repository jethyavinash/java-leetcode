package com.practice.coding.pattern.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LargestUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        int largestUniqueNum = findLargestUniqueNum(arr);
        System.out.println(largestUniqueNum);
    }

    private static int findLargestUniqueNum(int[] arr){
        int largestUnique = -1;
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i =0;i< arr.length;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }

        for(Integer key:freqMap.keySet()){
            if(freqMap.get(key) == 1){
                largestUnique = Math.max(largestUnique,key);
            }
        }
        return largestUnique;
    }
}
