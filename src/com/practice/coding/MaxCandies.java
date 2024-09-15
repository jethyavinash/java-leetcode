package com.practice.coding;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public static void main(String[] args) {
        int[] candies = {7, 3, 9, 2, 4};
        int extraCandies = 5;
        List<Boolean> maxCandies = findIfMaxCandies(candies,extraCandies);
        System.out.println(maxCandies);

    }

    private static List<Boolean> findIfMaxCandies(int[] candies, int extraCandies) {
        List<Boolean> hasMaxCandies = new ArrayList<>();
        int maxCandy = 0;
        for(int currentCandyCount : candies){
            if(currentCandyCount > maxCandy){
                maxCandy = currentCandyCount;
            }
        }

        for(int candyCount : candies){
            hasMaxCandies.add(candyCount+extraCandies > maxCandy);
        }

        return hasMaxCandies;
    }
}
