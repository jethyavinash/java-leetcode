package com.practice.coding;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,7,1,9,-1};
        int val = 2;
        int result = removeElement(nums,val);
        System.out.println(result);
    }

    private static int removeElement(int[] nums, int val) {
        int left = 0;

        for(int right = 0;right < nums.length;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
