package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "eegg";
        String input = "dog dog cat cat";
        boolean isCorrectPattern =  isCorrectWordPattern(pattern,input);
        System.out.println(isCorrectPattern);
    }

    private static boolean isCorrectWordPattern(String pattern,String input){
        String[] wordArr = input.split(" ");

        Map<Character,String> char2Word = new HashMap<>();
        Map<String,Character> word2Char = new HashMap<>();

        if(pattern.length() != wordArr.length){
            return false;
        }

        for(int i=0;i<wordArr.length-1;i++){
            char ch = pattern.charAt(i);
            String word = wordArr[i];

            if(char2Word.containsKey(ch)){
                if(!char2Word.get(ch).equals(word)){
                    return false;
                }
            }else {
                char2Word.put(ch,word);
            }

            if(word2Char.containsKey(word)){
                if(word2Char.get(word) != ch){
                    return false;
                }
            }else {
                word2Char.put(word, ch);
            }
        }
        return true;
    }
}
