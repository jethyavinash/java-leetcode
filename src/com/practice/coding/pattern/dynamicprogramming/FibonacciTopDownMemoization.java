package com.practice.coding.pattern.dynamicprogramming;

public class FibonacciTopDownMemoization {
    public static void main(String[] args) {
        int n = 6;
        int[] memo = new int[n+1];
        int result = fibonacci(n,memo);

        System.out.println(result);
    }

    public static int fibonacci(int n,int[] memo){
        if(n<=1){
            return n;
        }

        if(memo[n] != 0){
            return memo[n];
        }

        memo[n] = fibonacci(n-1,memo)+fibonacci(n-2,memo);
        return memo[n];
    }
}
