package com.practice.coding;

import java.util.Deque;
import java.util.LinkedList;

public class QueuePalindrom {
    public static void main(String[] args) {
        String input = "madama";
        boolean result = checkPalindrom(input);
        System.out.println("is it palindrome ? "+result);

    }

    private static boolean checkPalindrom(String input) {
        if(input == null || input.length() <= 1)
            return false;

        String updatedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        char[] chars = updatedInput.toCharArray();
        for(int i = 0; i< chars.length; i++){
            deque.add(chars[i]);
        }
        while (deque.size() > 1){
            char first = deque.pollFirst();
            char last = deque.pollLast();

            if(first != last){
                return false;
            }
        }
        return true;
    }
}
