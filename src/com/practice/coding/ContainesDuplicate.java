package com.practice.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainesDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numOccurrence = new HashSet<>();
        for(int num: nums){
            if(!numOccurrence.add(num)){
                return true;
            }
        }
        return false;
    }
}
