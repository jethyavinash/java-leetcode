package com.practice.coding;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 9, 7, 10, 11};
        int k = 4;
        boolean isDuplicate = checkIfDuplicatePresent(arr,k);
        System.out.println(isDuplicate);
    }
    public static boolean checkIfDuplicatePresent(int[] arr,int k) {
        boolean hasDuplicate = false;
        HashMap<Integer,Integer> numFreq = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(numFreq.containsKey(arr[i])){
                    if(i-numFreq.get(arr[i]) <= k){
                        return  true;
                    }
            } else {
                numFreq.put(arr[i],i);
            }
        }

        return false;
    }

}
