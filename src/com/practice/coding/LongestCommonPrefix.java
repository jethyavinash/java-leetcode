package com.practice.coding;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"abc", "ab"};
        String result = longestStrChain(words);
        System.out.println(result);
    }
    public static String longestStrChain(String[] words) {
        StringBuffer result =  new StringBuffer();
        if(words.length == 1)
            return words[0];
        Arrays.sort(words);
        char[] firstWord = words[0].toCharArray();
        char[] lastWord = words[words.length-1].toCharArray();
        int count = 0;
        for(int i = 0; i < firstWord.length ; i++){
            if((firstWord[i] != lastWord[i])){
                break;
            }else {
                result.append(firstWord[i]);
            }
        }
        return result.toString();
    }
}
