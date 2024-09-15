package com.practice.coding;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {3,8,2,6,4,8};
        insertionSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void selectionSort(int[] input) {
        for(int i = 0;i<input.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<input.length;j++){
                if(input[minIndex] > input[j]){
                    minIndex = j;
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
    }

    private static void bubbleSort(int[] input){
        boolean swapped = false;
        for(int i = 0; i < input.length-1;i++){
            for(int j=0;j<input.length-1-i;j++){
                if(input[j] > input[j+1] ){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
    private static void insertionSort(int[] input){
        for(int i = 0;i< input.length-1;i++){
            int j = i;
            while (j>0 && input[j-1] > input[j]){
                int temp = input[j-1];
                input[j-1] = input[j];
                input[j] = temp;
                j--;
            }
        }
    }

}
