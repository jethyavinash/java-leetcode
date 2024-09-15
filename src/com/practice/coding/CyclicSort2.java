package com.practice.coding;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort2 {
    public static void main(String[] args) {
        List<Integer> missingNum = findMissing(new int[] { 2, 4, 1, 2});
        System.out.println(missingNum);
    }

    private static List<Integer> findMissing(int[] nums) {
        ArrayList<Integer> missingNum = new ArrayList<>();
        int length = nums.length;


        int i = 0;
        while (i<nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swapit(nums,i,nums[i]-1);
            }else {
                i++;
            }
        }

        for(i = 0 ;i<nums.length;i++){
            if(nums[i] != i+1){
                missingNum.add(i+1);
            }
        }
        return missingNum;
    }

    private static void swapit(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
