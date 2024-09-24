package com.practice.coding;

public class ContainsDuplicate3 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,5,6};
        boolean hasDuplicate = contansDuplicate(arr);
        System.out.println(hasDuplicate);
    }

    private static boolean contansDuplicate(int[] arr){
        for(int i = 0;i<arr.length -1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
