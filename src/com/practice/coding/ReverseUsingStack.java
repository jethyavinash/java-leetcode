package com.practice.coding;

import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        String input = "Ayushmaan";
        String result = reverseString(input);
        System.out.println(result);
    }

    private static String reverseString(String input) {
        Stack<Character> characters = new Stack<>();
        for(char c: input.toCharArray()){
            characters.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!characters.isEmpty()){
            stringBuilder.append(characters.pop());
        }
        return stringBuilder.toString();
    }
}
