package com.practice.coding;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {




    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
                temp.add(arr[left]);
                left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    private static void mergeSortAlgo(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSortAlgo(arr,low, mid);
        mergeSortAlgo(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void main(String[] args) {

        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSortAlgo(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
