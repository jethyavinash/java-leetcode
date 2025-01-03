package com.practice.coding.pattern.warmup;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean isPangram = isPangram(input);
        System.out.println(isPangram);
    }

    private static boolean isPangram(String input){
        if(input.length() < 26)
            return false;

        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i< input.length(); i++){

            char currChar = input.charAt(i);
            if(Character.isLetter(currChar)){
                Character currCharLower = Character.toLowerCase(currChar);
                charSet.add(currCharLower);
            }
        }

        return charSet.size() == 26;
    }
}
