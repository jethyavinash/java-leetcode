package com.practice.coding;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] input = {5, 15, 25, 5, 35};
        int k = 1;
        boolean isNearbyDuplicateFound = containsNearByDeplucate(input,k);
        System.out.println(isNearbyDuplicateFound);
    }
    public static boolean containsNearByDeplucate(int[] input,int k){
        HashMap<Integer,Integer> numbersIndex = new HashMap<>();
        for(int i = 0; i<input.length-1;i++){
            if(numbersIndex.containsKey(input[i])){
                if(i - numbersIndex.get(input[i]) <= k){
                    return true;
                }
            }
            numbersIndex.put(input[i],i);
        }
        return false;
    }
}
