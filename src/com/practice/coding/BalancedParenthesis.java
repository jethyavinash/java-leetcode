package com.practice.coding;


import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String input = "{[()]}}";
        try {
            boolean isBalanced = isBalancedParenthesis(input);
            System.out.println("is balanced ? "+isBalanced);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isBalancedParenthesis(String input) throws Exception {
        if(input.isEmpty() || input.isBlank())
            throw new Exception("empty input");

        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: chars){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(top == '(' && c != ')')
                    return false;
                else if (top == '{' && c != '}')
                    return false;
                else if (top == '[' && c != ']')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
