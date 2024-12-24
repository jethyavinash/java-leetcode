package com.practice.coding.pattern.warmup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,5};
        boolean hasDuplicate = containsDuplicate2(nums);
        System.out.println(hasDuplicate);
    }

    private static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }

    private static boolean containsDuplicate2(int[] num){
        Arrays.sort(num);
        for(int i = 0;i< num.length - 1;i++){
            if(num[i] == num[i+1]){
                return true;
            }
        }
        return false;
    }
}
