package com.practice.coding;

import java.util.Arrays;

public class CycleSort1 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5,8,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int size = arr.length;
        int i = 0;
        while (i<size){
         int correctPlace = arr[i] - 1;
         if(arr[i] != arr[correctPlace]){
             swap(arr,i,correctPlace);
         }else {
             i++;
         }
        }
    }

    private static void swap(int[] arr, int wrong, int right) {
        int temp = arr[wrong];
        arr[wrong] = arr[right];
        arr[right] = temp;
    }
}
