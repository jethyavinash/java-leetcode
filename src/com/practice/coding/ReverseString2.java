package com.practice.coding;

import java.util.Stack;

public class ReverseString2 {
    public static void main(String[] args) {
        String input = "Hello World!";
        String reverse = reverseString(input);
        System.out.println(reverse);
    }

    private static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
