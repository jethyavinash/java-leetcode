package com.practice.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "gg";
        boolean result = checkIfPangram(sentence);
        System.out.println(result);
    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> unique = new HashSet<>();
        char[] charInSen = sentence.toLowerCase().toCharArray();
        for(int i = 0 ; i < charInSen.length ; i ++){
            if(Character.isLetter(charInSen[i])){
                unique.add(charInSen[i]);
            }
        }
        return unique.size() == 26;
    }
}
