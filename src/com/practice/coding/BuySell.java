package com.practice.coding;

public class BuySell {
    public static void main(String[] args) {
        int[] input = {3, 2, 6, 5, 0, 3};
        int maxProfit = findMaxProfit(input);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] input) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i : input){
            minValue = Math.min(i, minValue);
            maxProfit = Math.max(maxProfit, i-minValue);
        }
        return maxProfit;
    }
}
