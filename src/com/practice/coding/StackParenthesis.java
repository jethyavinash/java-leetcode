package com.practice.coding;
import java.util.Stack;

public class StackParenthesis {

    public static void main(String[] args) throws Exception {
        String test = "()";
        boolean isBalanced = isBalancedParanthesis(test);
        System.out.println("is balanced: "+isBalanced);
    }

    private static boolean isBalancedParanthesis(String input) throws Exception {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){


            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || c == ']' && top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
