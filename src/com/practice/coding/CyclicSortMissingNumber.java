package com.practice.coding;

public class CyclicSortMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,1,3,5};
        int missing = findMissingNumber(arr);
        System.out.println(missing);
    }

    private static int findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length-1){
            if(arr[i] < arr.length && i != arr[i]){
                swap(arr,i,arr[i]);
            }else {
                i++;
            }
        }
        for(int j = 0;j<arr.length;j++){
            if(j != arr[j]){
                return j;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
