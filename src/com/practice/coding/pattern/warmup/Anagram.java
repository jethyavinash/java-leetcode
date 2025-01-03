package com.practice.coding.pattern.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        boolean isAnagram = checkAnagram(a,b);
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i),0 )-1);
        }

        for(Character c : map.keySet()){
            if(map.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
