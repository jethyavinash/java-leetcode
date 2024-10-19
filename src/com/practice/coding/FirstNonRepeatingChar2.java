package com.practice.coding;

import java.util.HashMap;

public class FirstNonRepeatingChar2 {
    public static void main(String[] args) {
        int result = findFirstNonRepeatingCharPosition("apple");
        System.out.println(result);
    }

    private static int findFirstNonRepeatingCharPosition(String str){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : str.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<str.length();i++){
            if(freq.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
