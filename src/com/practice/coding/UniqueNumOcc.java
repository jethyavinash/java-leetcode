package com.practice.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumOcc {
    public static void main(String[] args) {
        int[] input = {4, 5, 4, 6, 6, 6};
        boolean result  = findUniqueueOcc(input);
        System.out.println(result);

    }

    private static boolean findUniqueueOcc(int[] input) {
        boolean result = true;
        HashMap<Integer,Integer> occMap = new HashMap<>();
        for(int i : input){
            occMap.put(i,occMap.getOrDefault(i,0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for(Integer i : occMap.values()){
            if(!set.add(i)){
                result = false;
                break;
            }
        }
        return result;
    }
}
