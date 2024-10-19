package com.practice.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LargestUniqueNumber2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 4};
        int result = largestUniqueNum(arr);
        System.out.println(result);
    }

    private static int largestUniqueNum(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int max = -1;
        for(Integer key :freq.keySet()){
            if(freq.get(key) == 1){
                max =  Math.max(max,key);
            }
        }
        return max;
    }
}
