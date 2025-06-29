package com.practice.coding.pattern.simulation;

public class WaterBottles {
    public static void main(String[] args) {
        int fullBottles = 7;
        int exchangeBottles = 2;
        int total = totalBottleDrink(fullBottles,exchangeBottles);

        System.out.println(total);
    }

    public static int totalBottleDrink(int fullBottle, int exchangeBottles){
        int emptyBottles = fullBottle;
        int totalDrunk = fullBottle;

        while(emptyBottles > exchangeBottles){
            int newBottles = emptyBottles/exchangeBottles;
            totalDrunk = totalDrunk + newBottles;
            emptyBottles = emptyBottles%exchangeBottles + newBottles;
        }
        return totalDrunk;
    }
}
