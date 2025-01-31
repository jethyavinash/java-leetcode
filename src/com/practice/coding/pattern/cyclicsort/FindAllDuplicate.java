package com.practice.coding.pattern.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,1,2,1};
        List<Integer> allDupes = findALlDuplicates(arr);
        System.out.println(allDupes);
    }

    private static List<Integer> findALlDuplicates(int[] arr){
        List<Integer> allDupes = new ArrayList<>();
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        for(int k =0;k<arr.length;k++){
            if(arr[k] != k+1){
                allDupes.add(arr[k]);
            }
        }

        return allDupes;
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
