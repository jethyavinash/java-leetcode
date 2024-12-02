package com.practice.coding.recursion;

public class ArraySummation {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,6,8,4};
        int result = arrSummation(arr,arr.length);
        System.out.println(result);
    }

    private static int arrSummation(int[] arr,int length) {
        if(length == 0){
            return 0;
        }
        return arr[length-1] + arrSummation(arr, length-1);
    }
}
