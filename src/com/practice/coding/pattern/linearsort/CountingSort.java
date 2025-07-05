package com.practice.coding.pattern.linearsort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] input = {2,1,1,3,4};
        sortByCountingSort(input);
        System.out.println(Arrays.toString(input));
    }

    private static void sortByCountingSort(int[] input){
        if(input == null || input.length < 1)
            return;

        int max = 0;
        for(int i = 0; i< input.length ; i++){
            max = Math.max(input[i],max);
        }

        int[] countArr = new int[max+1];
        for(int j = 0;j < countArr.length ; j++){
            countArr[input[j]]++;
        }
        int index = 0;
        for(int k = 0 ; k < countArr.length ; k++){
            while (countArr[k] > 0){
                input[index] = k;
                index++;
                countArr[k]--;
            }
        }


    }
}
