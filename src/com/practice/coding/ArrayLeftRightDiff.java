package com.practice.coding;

import java.util.Arrays;

public class ArrayLeftRightDiff {
    public static void main(String[] args) {
        int[] input =  {2, 5, 1, 6};
        int[] result = leftRightSumDiff(input);
        System.out.println(Arrays.toString(result));
    }

    private static int[] leftRightSumDiff(int[] input) {
        int arrLength = input.length;
        int[] leftSumArr = new int[arrLength];leftSumArr[0]=input[0];
        int[] rightSumArr = new int[arrLength];rightSumArr[arrLength -1] = input[arrLength -1];
        int[] result = new int[arrLength];

        int leftSum = input[0];
        for(int i = 1; i< arrLength; i++ ){
            leftSum = leftSum+input[i];
            leftSumArr[i] = leftSum;
        }

        int rightSum = input[arrLength -1];
        for(int j = input.length-2;j>=0;j--){
            rightSum = rightSum+input[j];
            rightSumArr[j]=rightSum;
        }
        for(int i=0;i<input.length;i++){
            result[i] = Math.abs(leftSumArr[i] - rightSumArr[i]);
        }

        return result;
    }
}
