package com.practice.coding.recursion;

public class NumberFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int freq = numberFreqHelper(arr,2,0);
        System.out.println(freq);
    }



    private static int numberFreqHelper(int[] arr, int key, int index) {
        if(index >= arr.length){
            return 0;
        }

        int count = arr[index] == key ? 1 : 0;
        return numberFreqHelper(arr,key,index+1)+count;
    }
}
