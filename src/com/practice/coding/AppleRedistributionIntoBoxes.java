package com.practice.coding;

import java.util.Arrays;

public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apples = {2,3,1};
        int[] capacity = {4,2,5,1};
        int minBoxes = minBoxes(apples,capacity);
        System.out.println(minBoxes);
    }

    private static int minBoxes(int[] apples, int[] capacity) {
        Arrays.sort(capacity);
        int totalApples = 0;
        for(int appleNo : apples){
            totalApples+=appleNo;
        }
        int i = capacity.length -1;
        while (i>=0 && totalApples > 0){
            totalApples = totalApples - capacity[i];
            i--;
        }
        return capacity.length - (i+1);
    }
}
