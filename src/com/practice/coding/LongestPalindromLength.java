package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromLength {
    public static void main(String[] args) {
        String s = "racecar";
        int result = longestPalindrome(s);
        System.out.println("result: "+result);
    }

    private static int longestPalindrome(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : chars){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        boolean oddFound = false;
        for(char key :freq.keySet()){
            if(freq.get(key) % 2 == 0){
                result = result + freq.get(key);
            }else {
                oddFound = true;
                result = result + (freq.get(key) - 1);
            }
        }

        if(oddFound){
            result = result + 1;
        }

        return result;
    }
}
