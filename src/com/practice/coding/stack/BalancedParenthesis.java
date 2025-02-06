package com.practice.coding.stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String input = "()";
        boolean isBalanced = isBalanced(input);
        System.out.println(isBalanced);
    }

    private static boolean isBalanced(String input){
        boolean isBalanced = false;
        char[] chars =  input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : chars){
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char popped = stack.pop();
                if(c == ')' && popped != '('){
                    return false;
                }

                if(c == '}' && popped != '{'){
                    return false;
                }

                if(c == ']' && popped != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
