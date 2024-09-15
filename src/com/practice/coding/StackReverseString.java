package com.practice.coding;

import java.util.Stack;

public class StackReverseString {
    public static void main(String[] args) {
        String input = "christmas";
        String output = reverse(input);
        System.out.println(output);
    }

    private static String reverse(String input) {
        StringBuilder reverseString = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        while (!stack.isEmpty()){
            reverseString.append(stack.pop());
        }
        return reverseString.toString();
    }
}
