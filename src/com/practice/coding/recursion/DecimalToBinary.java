package com.practice.coding.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 13;
        String result = decimalToBinary(num);
        System.out.println(result);
    }

    private static String decimalToBinary(int num) {
        if(num == 0){
            return "";
        }
        return decimalToBinary(num/2) + (num%2);
    }
}
