package com.practice.coding;

public class FindHighestAlttitude {
    public static void main(String[] args) {
        int[] arr = {2, 2, -3, -1, 2, 1, -5};
        int highestAltitue = findHighestAltitude(arr);
        System.out.println(highestAltitue);
    }

    private static int findHighestAltitude(int[] arr) {
        int maxHeight = 0;
        int currAltitute = 0;
        for(int height : arr){
            currAltitute = currAltitute + height;
            maxHeight = Math.max(maxHeight,currAltitute);
        }
        return maxHeight;
    }
}
