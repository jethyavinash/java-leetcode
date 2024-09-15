package com.practice.coding;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {33,66,2,8,4,62};
        quickSortAlgo(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortAlgo(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr,low,high);
            quickSortAlgo(arr,low,pi-1);
            quickSortAlgo(arr,pi+1,high);
        }
    }


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i<j){
            while (arr[i] <= pivot && i <= high-1) {
                i++;
            }
            while (arr[j] > pivot && j >= low-1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
}
