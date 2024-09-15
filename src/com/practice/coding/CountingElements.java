package com.practice.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountingElements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        int result = findCountPlusOne(arr);
        System.out.println(result);
    }

    private static int findCountPlusOne(int[] arr) {
        int result = 0;

        HashSet<Integer> numSet = new HashSet<>();
        for(int num : arr){
            numSet.add(num);
        }

        for(int num : arr){
            if(numSet.contains(num+1)){
                result++;
            }
        }
        return result;
    }
}
