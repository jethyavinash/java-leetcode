package com.practice.coding.pattern.monotonicstack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abccccba";
        String result = removeAllAdjDupes(s);
        System.out.printf("result: %s\n", result);
    }

    private static String removeAllAdjDupes(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c: input.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
}
