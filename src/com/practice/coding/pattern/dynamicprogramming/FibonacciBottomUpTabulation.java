package com.practice.coding.pattern.dynamicprogramming;

public class FibonacciBottomUpTabulation {
    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println(result);
    }

    private static int fibonacci(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2;i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
