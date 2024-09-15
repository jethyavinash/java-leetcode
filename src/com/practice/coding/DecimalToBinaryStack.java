package com.practice.coding;

import java.util.Stack;

public class DecimalToBinaryStack {
    public static void main(String[] args) {
        int decimalInput = 7;
        String  binaryOutput = binaryResponse(decimalInput);
        System.out.println(binaryOutput);
    }

    private static String  binaryResponse(int decimalInput) {
        Stack<Integer> binaryStack = new Stack<>();
        int num = decimalInput;
        while (num > 0){
            binaryStack.push(num%2);
            num = num/2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!binaryStack.isEmpty()){
            stringBuilder.append(binaryStack.pop());
        }
        return stringBuilder.toString();
    }
}
