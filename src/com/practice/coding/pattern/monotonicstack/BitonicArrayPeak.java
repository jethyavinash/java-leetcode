package com.practice.coding.pattern.monotonicstack;

public class BitonicArrayPeak {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,3,2};
        int peak = findPeak(arr);
        System.out.println(peak);
    }
    private static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return arr[start];
    }
}
