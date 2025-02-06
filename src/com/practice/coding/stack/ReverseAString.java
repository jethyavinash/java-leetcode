package com.practice.coding.stack;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "openai";
        System.out.println(reverse(input));
    }

    private static String reverse(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
}
