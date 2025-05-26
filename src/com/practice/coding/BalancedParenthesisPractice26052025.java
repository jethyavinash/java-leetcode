package com.practice.coding;

import java.util.Stack;

public class BalancedParenthesisPractice26052025 {
    public static void main(String[] args) {
        String parenthesis = "{([])}}";
        boolean isBalanced = isBalancedParenthesis(parenthesis);
        System.out.println(isBalanced);
    }

    private static boolean isBalancedParenthesis(String parenthesis){
        Stack<Character> stack = new Stack<>();
        char[] parenthesisChars = parenthesis.toCharArray();
        for(int i = 0;i< parenthesis.length();i++){
            if(parenthesisChars[i] == '{' || parenthesisChars[i] == '(' || parenthesisChars[i] == '['){
                stack.push(parenthesisChars[i]);
            }else{
                if(stack.isEmpty())
                    return false;

                char lastParenthesis = stack.pop();
                if(lastParenthesis == '{' && parenthesisChars[i] != '}'){
                    return false;
                }
                if(lastParenthesis == '(' && parenthesisChars[i] != ')'){
                    return false;
                }
                if(lastParenthesis == '[' && parenthesisChars[i] != ']'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
