package com.practice.coding;

import java.util.Arrays;
import java.util.HashMap;

public class CountPairDiff {
    public static void main(String[] args) {
        int[] arr = {1,3,3,3,5,2};
        int diff = 2;
        int count = countPairDiff2(arr,diff);
        System.out.println("result: "+count );
    }

    private static int countPairDiff(int[] arr, int diff) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]-arr[i] == diff){
                    count++;
                }
            }
        }
        return count;
    }

    private  static int countPairDiff2(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        // Iterate over the array, counting occurrences and checking for complements
        for (int num : nums) {
            // Increment count if a complement (num ± k) exists
            count += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
            // Update the map with the current number's frequency
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
