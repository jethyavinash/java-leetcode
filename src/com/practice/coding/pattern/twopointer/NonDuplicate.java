package com.practice.coding.pattern.twopointer;

public class NonDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 6, 9, 9};
        int nonDuplicateSize = findNonDuplicateSize(arr);
        System.out.println(nonDuplicateSize);
    }

    private static int findNonDuplicateSize(int[] arr){
        int nonDupePointer = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[nonDupePointer] != arr[i]){
                nonDupePointer++;
                arr[nonDupePointer] = arr[i];
            }
        }
        return nonDupePointer+1;
    }
}
