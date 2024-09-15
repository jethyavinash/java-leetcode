package com.practice.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
    public static void main(String[] args) {
        int[] arr = new int[] {-3, 0, 1, 2, -1, 1, -2};
        List<List<Integer>> triplets = searchTriplets(arr);
        System.out.println(triplets);
    }

    private static List<List<Integer>> searchTriplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int targetSum = -arr[i];
            addTriplet(arr,i+1,targetSum,result);
        }
        return result;
    }

    private static void addTriplet(int[] arr, int left, int targetSum, List<List<Integer>> result) {
        int right = arr.length-1;
        while (left<right){
            int sum = arr[left] + arr[right];
            if(sum == targetSum){
                result.add(List.of(-targetSum,arr[left],arr[right]));
                left++;
                right--;
            }else if(sum<targetSum){
                left++;
            }else {
                right--;
            }
        }
    }
}
