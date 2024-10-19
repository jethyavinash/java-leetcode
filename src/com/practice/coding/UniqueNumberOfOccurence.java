package com.practice.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 6};
        boolean result = findIfUniqueOccurence(arr);
        System.out.println(result);
    }

    private static boolean findIfUniqueOccurence(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        HashSet<Integer> unique = new HashSet<>();
        for(Integer i : map.values()){
            if(!unique.add(i)){
                return false;
            }
        }
        return true;
    }
}
