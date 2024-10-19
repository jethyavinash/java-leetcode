package com.practice.coding;

import java.util.HashMap;
import java.util.HashSet;

public class CountingElements2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        int result = countPlusOne(arr);
        System.out.println(result);
    }

    private static int countPlusOne(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : arr){
            hashSet.add(num);
        }
        int count = 0;
        for(int num : arr){
            count = hashSet.contains(num+1) ? count+1 : count;
        }
        return count;
    }
}
