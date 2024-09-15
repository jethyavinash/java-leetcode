package com.practice.coding;

public class ArrayHighestAltitude {
    public static void main(String[] args) {
        int[] input = {2, 2, -3, -1, 2, 1, -5};
        int result = highestAltitude(input);
        System.out.println(result);
    }

    private static int highestAltitude(int[] input) {
        int[] sumArray = new int[input.length];
        sumArray[0] = input[0];
        int highest = sumArray[0];
        for(int i=1;i<input.length;i++){
            sumArray[i] = sumArray[i-1]+input[i];
            if(sumArray[i]>highest){
                highest=sumArray[i];
            }
        }
        return highest;
    }
}
