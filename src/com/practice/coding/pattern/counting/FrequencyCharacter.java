package com.practice.coding.pattern.counting;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String input = "avinash";
        Map<Character,Integer> charFreq = findCharFreq(input);
        System.out.println("char freq is : "+charFreq);
    }

    private static Map<Character,Integer> findCharFreq(String input){
        Map<Character,Integer> charFreq = new HashMap<>();
        for(char c : input.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c,0)+1);
        }
        return charFreq;
    }
}
