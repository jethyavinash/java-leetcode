package com.practice.coding.pattern.slidingwindow;

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {3, 2, 6, 5, 2, 3,10};
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
