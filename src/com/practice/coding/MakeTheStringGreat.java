package com.practice.coding;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "AaBbCcDdEefg";
        String result = makeTheStringGreat(s);
        System.out.println("result: "+result);
    }

    private static String makeTheStringGreat(String s) {
        Stack<Character> stack = new Stack<>();
        for(char a: s.toCharArray()){
            if(!stack.isEmpty() && Character.toUpperCase(a) == Character.toUpperCase(stack.peek()) && !stack.peek().equals(a)){
                stack.pop();
            }else {
                stack.push(a);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : stack){
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

}
