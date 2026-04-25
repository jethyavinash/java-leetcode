package com.practice.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoSum_ByteByteGo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 9;
        List<Integer> result = findIndexForTwoSum(arr,target);
        System.out.println(result);
    }

    public static List<Integer> findIndexForTwoSum(int[] arr,int target){
        int left = 0; int right = arr.length - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                return List.of(left,right);
            }
        }
        return Collections.EMPTY_LIST;
    }
}
