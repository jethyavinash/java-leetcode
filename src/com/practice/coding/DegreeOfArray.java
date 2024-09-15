package com.practice.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] nums = {4, 9, 4, 4, 5, 5, 4};
        int result = degreeOfArray(nums);
        System.out.println(result);
    }

    private static int degreeOfArray(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> occurence = new HashMap<>();
        for(int i: nums){
            occurence.put(i, occurence.getOrDefault(i, 0)+1);
        }

        int maxValue = -1;
        int maxKey = -1;
        for(Map.Entry<Integer,Integer> entry: occurence.entrySet()){
            if(entry.getValue()>maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        int minIndex = -1;
        int maxIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == maxKey){
                if(minIndex == -1){
                    minIndex = i;
                }
                maxIndex = i;
            }
        }
        result = maxIndex-minIndex+1;
        return result;
    }
}
