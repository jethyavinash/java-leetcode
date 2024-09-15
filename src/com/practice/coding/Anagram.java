package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "hellfo";
        String t = "llohe";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> trackerMap = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            trackerMap.put(s.charAt(i),trackerMap.getOrDefault(s.charAt(i),0)+1);
            trackerMap.put(t.charAt(i),trackerMap.getOrDefault(t.charAt(i),0)-1);
        }
        for(Map.Entry<Character,Integer> entry : trackerMap.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
