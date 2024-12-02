package com.practice.coding.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int result = fibonacci(3);
        System.out.println(result);
    }

    public static int fibonacci(int num){
        if(num <= 1)
            return num;
        else
            return fibonacci(num-1) + fibonacci(num-2);
    }
}
