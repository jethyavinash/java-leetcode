package com.practice.coding;

import java.util.Stack;

public class StackDecimalToBinary {
    public static void main(String[] args) {
        int result = decimalToBinary(7);
        System.out.println(result);
    }

    private static int decimalToBinary(int input) {
        StringBuilder binary = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (input>0){
            stack.push(input%2);
            input = input/2;
        }

        while (!stack.isEmpty()){
            binary.append(stack.pop());
        }
        return Integer.parseInt(binary.toString());
    }
}
