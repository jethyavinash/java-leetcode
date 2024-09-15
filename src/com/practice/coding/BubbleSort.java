package com.practice.coding;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {1,-44,22,5,7,32};
        bubbleSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    private static void bubbleSort(int[] intArray) {
        for(int rightToleft = intArray.length-1 ; rightToleft>0;rightToleft--){
            for (int leftToRight = 0; leftToRight < rightToleft ; leftToRight++){
                if(intArray[leftToRight] > intArray[leftToRight+1]){
                    swapArray(intArray,leftToRight,leftToRight+1);
                }
            }
        }
    }

    private static void swapArray(int[] intArray, int left, int right) {
        int temp = intArray[left];
        intArray[left] = intArray[right];
        intArray[right] = temp;

    }
}
