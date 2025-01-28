package com.practice.coding.pattern.cyclicsort;

import java.util.Arrays;

public class MissingNumberCyclicSort {
    public static void main(String[] args) {
        int[] arr = {0,2,1};
        int result = findMissing(arr);
        System.out.println(result);
    }

    private static int findMissing(int[] arr){
        int indexPointer = 0;
        while (indexPointer < arr.length){
            if(arr[indexPointer] != indexPointer && arr[indexPointer] < arr.length){
                int temp = arr[indexPointer];
                arr[indexPointer] = arr[temp];
                arr[temp] = temp;
            }else {
                indexPointer++;
            }
        }

        for(int i=0;i< arr.length;i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}
