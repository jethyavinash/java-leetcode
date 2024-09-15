package com.practice.coding;

public class MinimumBoat {
    public static void main(String[] args) {
        int[] people = {30,20,10,100,85};
        int limit = 90;
        int minBoat = findMinimumBoat(people,limit);
        System.out.println(minBoat);
    }

    private static int findMinimumBoat(int[] people, int limit) {
        int boats = 0;
        int i = 0;
        int j = people.length - 1;
        while (i<j){
            if(people[i]+people[j] < limit){
                i++;
            }
            j--;
            boats++;
        }
        if(i==j){
            boats++;
        }
        return boats;
    }
}
