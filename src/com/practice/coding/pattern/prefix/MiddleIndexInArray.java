package com.practice.coding.pattern.prefix;

public class MiddleIndexInArray {
    public static void main(String[] args) {
        int[] arr = {6,1,2,3,4};
        int middleIndex = findMiddleIndexInArr(arr);
        System.out.println(middleIndex);
    }

    private static int findMiddleIndexInArr(int[] arr){
        int sumArr = 0;
        for(int i=0;i<arr.length;i++){
            sumArr+=arr[i];
        }
        int leftSum = 0;
        for(int j = 0;j<arr.length;j++){
            int rightSum = sumArr - leftSum - arr[j];
            if(leftSum == rightSum) return j;
            leftSum+=arr[j];
        }
        return -1;
    }

}
