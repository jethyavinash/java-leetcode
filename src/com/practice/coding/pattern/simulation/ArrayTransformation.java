package com.practice.coding.pattern.simulation;

import java.util.Arrays;

public class ArrayTransformation {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 6};
        int[] finalArr = finalTransformed(arr);
        System.out.println(Arrays.toString(finalArr));
    }

    private static int[] finalTransformed(int[] arr) {
        boolean changed = true;
        int len = arr.length;
        while(changed){
            changed = false;
            int[] temp = arr.clone();
            for(int i=1;i<len-1;i++){
                if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                    changed = true;
                    temp[i] = temp[i]+1;
                }else if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    changed = true;
                    temp[i] = temp[i]-1;
                }
            }
            arr = temp;
        }
        return arr;
    }
}
