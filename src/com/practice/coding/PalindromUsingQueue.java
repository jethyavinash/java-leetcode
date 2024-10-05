package com.practice.coding;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromUsingQueue {
    public static void main(String[] args) {
        String input = "tenet";
        boolean isPalindrom = isPalindrome(input);
        System.out.println(isPalindrom);
    }
    public static boolean isPalindrome(String input){
        Deque<Character> deque = new LinkedList<>();
        for(char c: input.toCharArray()){
            deque.add(c);
        }

        while (deque.size() > 1){
            if(!deque.pollFirst().equals(deque.pollLast())){
                return false;
            }
        }
        return true;
    }
}
