package com.practice.coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayContainsDuplicate {
    public static void main(String[] args) {
        int[] input = {10,20,10,30};
        int key = 10;
        boolean isDuplicate = isDuplicateKey(input,key);
        System.out.println(isDuplicate);
    }

    private static boolean isDuplicateKey(int[] input, int key) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int k : input){
            countMap.put(k,countMap.getOrDefault(k, 0)+1);
        }



        return countMap.get(key) == null ? false : countMap.get(key) > 0;
    }

}
