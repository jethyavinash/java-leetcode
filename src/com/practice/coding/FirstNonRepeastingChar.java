package com.practice.coding;

import java.util.HashMap;

public class FirstNonRepeastingChar {
    public static void main(String[] args) {
        String word = "apple";
        int position = findNonRepeatingChar(word);
        System.out.println(position);
    }

    private static int findNonRepeatingChar(String word) {
        char[] chars = word.toCharArray();
        HashMap<Character,Integer> freq = new HashMap<>();
        HashMap<Character,Integer> charToIndex = new HashMap<>();

        for(int i=0;i<chars.length;i++){
            freq.put(chars[i],freq.getOrDefault(chars[i],0)+1);
            charToIndex.put(chars[i],i);

        }

        int max = -1;
        for(char key : freq.keySet()){
            if(freq.get(key) == 1){
                return charToIndex.get(key);
            }
        }

        return -1;
    }
}
