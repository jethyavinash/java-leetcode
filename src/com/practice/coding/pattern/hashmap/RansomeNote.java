package com.practice.coding.pattern.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    public static void main(String[] args) {
        String ransomeNote = "hellom";
        String magzine = "helloworld";
        boolean isRansomeNote = findIfRansomeNote(ransomeNote,magzine);
        System.out.println(isRansomeNote);
    }

    private static boolean findIfRansomeNote(String ransome,String magszine){
        Map<Character,Integer> freqMap = new HashMap<>();
        for(Character c : magszine.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        for(Character c: ransome.toCharArray()){
            if(!freqMap.containsKey(c) || freqMap.get(c) == 0){
                return false;
            }
            freqMap.put(c, freqMap.get(c) -1);
        }
        return true;
    }
}
