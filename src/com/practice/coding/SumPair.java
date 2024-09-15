package com.practice.coding;

public class SumPair {
    public static void main(String[] args) {
        int[] result = search(new int[] { 1, 2, 3, 4, 6 }, 7);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");


    }

    private static int[] search(int[] nums, int targetSum) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left]+nums[right];
            if(sum == targetSum)
                return new int[]{left,right};
            else if(sum>targetSum)
                right--;
            else if(sum < targetSum)
                left++;
        }
        return new int[]{-1,-1};
    }
}
