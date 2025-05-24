package com.practice.coding.pattern.hashmap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] result = twoSumProblem(arr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSumProblem(int[] arr,int target){
        HashMap<Integer,Integer> numAndIndexMap = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            int complement = target - arr[i];
            if(numAndIndexMap.containsKey(complement)){
                return new int[]{i,numAndIndexMap.get(complement)};
            }
            numAndIndexMap.put(arr[i],i);

        }
        return null;
    }
}
