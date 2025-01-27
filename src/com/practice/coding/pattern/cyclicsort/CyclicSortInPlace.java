package com.practice.coding.pattern.cyclicsort;

import java.util.Arrays;

public class CyclicSortInPlace {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int[] result = sortInPlace(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortInPlace(int[] arr){
        int pointer = 0;
        while (pointer < arr.length){
            int rightIndex = arr[pointer] - 1;
            if(arr[rightIndex] != arr[pointer]){
                swap(arr,pointer,rightIndex);
            }else{
                pointer++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
