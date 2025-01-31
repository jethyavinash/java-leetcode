package com.practice.coding.pattern.cyclicsort;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        int result = findDuplicateNumber(arr);
        System.out.println(result);
    }

    private static int findDuplicateNumber(int[] arr){
        int result = -1;
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(i != correctIndex){
                if(arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return result;
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
