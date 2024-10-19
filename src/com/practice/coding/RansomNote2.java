package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class RansomNote2 {
    public static void main(String[] args) {
        boolean isPossible = isPossibleToConstruct("notes", "stoned");
        System.out.println(isPossible);
    }

    private static boolean isPossibleToConstruct(String ransom, String magazine) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : magazine.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(char c : ransom.toCharArray()){
            if(!freq.containsKey(c) || freq.get(c) == 0){
                return false;
            }else {
                freq.put(c, freq.get(c)-1);
            }
        }
        return true;
    }
}
