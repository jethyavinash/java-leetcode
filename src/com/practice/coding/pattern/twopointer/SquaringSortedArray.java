package com.practice.coding.pattern.twopointer;

import java.util.Arrays;

public class SquaringSortedArray {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 2, 3};
        int[] sqrArr = squareSortedArr(arr);
        System.out.println(Arrays.toString(sqrArr));
    }

    private static int[] squareSortedArr(int[] arr){
        int[] sqrArr = new int[arr.length];
        int maxPointer = arr.length - 1;
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer < rightPointer){
            int leftSqr = arr[leftPointer] * arr[leftPointer];
            int rightSqr = arr[rightPointer] * arr[rightPointer];
            if(leftSqr > rightSqr){
                sqrArr[maxPointer] = leftSqr;
                maxPointer--;
                leftPointer++;
            } else {
                sqrArr[maxPointer] = rightSqr;
                maxPointer--;
                rightPointer--;
            }
        }
        return sqrArr;
    }
}
