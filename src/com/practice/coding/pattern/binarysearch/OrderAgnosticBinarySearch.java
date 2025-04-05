package com.practice.coding.pattern.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,9};int k1 = 3;
        int result1 = binarySearch(num1,k1);
        System.out.println(result1);

        int[] num2 = {2,3,4,5,6,7,8,9};int k2 = 8;
        int result2 = binarySearch(num2,k2);
        System.out.println(result2);

        int[] num3 = {};int k3 = 8;
        int result3 = binarySearch(num3,k3);
        System.out.println(result3);
    }

    private static int binarySearch(int[] num,int k){
        if(num.length == 0){
            return -1;
        }
        int start = 0;
        int end = num.length-1;
        boolean isAcending = num[start] < num[end];

        while(start < end){
            int mid = start + (end - start)/2;
            if(k == num[mid])
                return mid;
            if(isAcending){
                if(k > num[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }else {
                if(k > num[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
