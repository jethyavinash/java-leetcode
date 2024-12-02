package com.practice.coding.recursion;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int num) {
        if(num == 0 || num == 1){
            return 1;
        }else {
            return num * factorial(num-1);
        }

    }
}
