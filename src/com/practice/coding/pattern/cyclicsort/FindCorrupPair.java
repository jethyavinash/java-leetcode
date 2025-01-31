package com.practice.coding.pattern.cyclicsort;

import java.util.Arrays;

public class FindCorrupPair {
    public static void main(String[] args) {
        int[] arr = {3,4,1,3};
        int[] result = findCorruptPair(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findCorruptPair(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        for(int k = 0;k < arr.length;k++){
            if(arr[k] != k+1){
                return new int[]{arr[k],k+1};
            }
        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
