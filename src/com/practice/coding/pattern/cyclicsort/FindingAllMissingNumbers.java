package com.practice.coding.pattern.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindingAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 2, 3, 5, 1};
        List<Integer> missingNums = findMissingNumbers(arr);
        System.out.println(missingNums);
    }

    private static List<Integer> findMissingNumbers(int[] arr){
        List<Integer> missingNums = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex] && arr[i] <= arr.length){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        for(int k = 0; k < arr.length; k++){
           if(arr[k] != k+1){
               missingNums.add(k+1);
           }
        }

        return missingNums;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
