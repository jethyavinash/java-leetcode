package com.practice.coding;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {2,5,2,8,44,5};
        int target = 44;
        int result = biarySearch(input,target);
        System.out.println(result);
    }

    private static int biarySearch(int[] input, int target) {
        int left = 0;
        int right = input.length-1;

        while (left<right){
            int middle = left+(right-left)/2;
            if(target < input[middle]){
                right = middle-1;
            }else if(target > input[middle]){
                left = middle+1;
            }else {
                return input[middle];
            }
        }
        return -1;
    }
}
