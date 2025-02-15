package com.practice.coding.pattern.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String[] args) {
        String input = "racekcar";
        int result = findLongestPalindromeLength(input);
        System.out.println(result);
    }

    private static int findLongestPalindromeLength(String input){
        Map<Character,Integer> freqMap = new HashMap<>();
        for(Character c : input.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        boolean isOddFound = false;
        int result = 0;
        for(int freq : freqMap.values()){
            if(freq % 2 == 0){
                result += freq;
            }else {
                isOddFound = true;
                result  = result + (freq-1);
            }
        }
        if(isOddFound){
            result+=1;
        }
        return result;
    }
}
