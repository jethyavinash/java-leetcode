package com.practice.coding;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        System.out.println("Hello world!");
        int[] nums = {2,4,5,7,3};
        int val = 4;
        int j = 0;
        int[] expected = new int[5];
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=val){
                expected[j] = nums[i];
                j++;
            }
        }

        System.out.println("expected:: "+ Arrays.toString(expected));
    }
}