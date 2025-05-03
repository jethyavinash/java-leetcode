package com.practice.coding.pattern.greedyalgorithm;

import java.util.Arrays;

public class RescueBoatMinimum {
    public static void main(String[] args) {
        int[] weights = {10,55,70,20,90,85};
        int maxBoatCapcity = 100;
        int minBoats = findMinimumBoats(weights,maxBoatCapcity);
        System.out.println(minBoats);
    }

    private static int findMinimumBoats(int[] weights,int maxBoatCapacity){
        Arrays.sort(weights);
        int minBoat = 0;
        int light = 0;
        int heavy = weights.length-1;
        while (light <= heavy){
            int totalWeight = weights[light]+weights[heavy];
            if(totalWeight <= maxBoatCapacity){
                light++;
            }
            heavy--;
            minBoat++;
        }
        return minBoat;
    }
}
