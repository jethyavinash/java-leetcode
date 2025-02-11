package com.practice.coding.pattern.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "applea";
        int indexOfFirstNonRepeatingChar = firstNonRepeatingChar(input);
        System.out.println(indexOfFirstNonRepeatingChar);
    }

    private static int firstNonRepeatingChar(String input){
        Map<Character,Integer> charFreq = new HashMap<>();
        char[] charArr = input.toCharArray();
        for(Character c : charArr){
            charFreq.put(c, charFreq.getOrDefault(c,0)+1);
        }

        for(int i = 0;i< charArr.length ; i++){
            if(charFreq.get(charArr[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
