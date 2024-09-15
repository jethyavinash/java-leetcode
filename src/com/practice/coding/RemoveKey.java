package com.practice.coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveKey {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 6, 3, 10, 9, 3 };
        int[] result = removeKey(arr,2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeKey(int[] arr,int key) {
        int f = 0;
        int s = 0;
        for(;s< arr.length;s++){
            if(arr[s] != key){
                int temp = arr[s];
                arr[s] = arr[f];
                arr[f] = temp;
                f++;
            }
        }
        return arr;
    }
}
