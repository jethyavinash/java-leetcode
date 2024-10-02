package com.practice.coding;

import java.util.Stack;

public class BalancedParanthesis2 {
    public static void main(String[] args) {
        String input = "{[()]}}";
        boolean isValid = isBalancedParanthesis(input);
        System.out.println(isValid);
    }

    private static boolean isBalancedParanthesis(String input) {
        char[] charArr = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : charArr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c == ')' && top != '('){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
                if(c == ']' && top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
