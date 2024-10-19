package com.practice.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindrom {
    public static void main(String[] args) {
        String s = "racecar";
        int result = longestPalindrome(s);
        System.out.println(result);
    }

    private static int longestPalindrome(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        int len = 0;
        boolean oddFound = false;
        for(int num : freq.values()){
            if(num % 2 == 0){
                len+=num;
            }else {
                len+=num-1;
                oddFound = true;
            }
        }
        if(oddFound){
            len++;
        }
        return len;
    }
}
