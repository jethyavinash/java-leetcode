package com.practice.coding.pattern.binarysearch;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        //boolean isPerfectSquare = isPerfectSquare(16,1,num/2+1);
        boolean isPerfectSquare = isPerFectSquareNotOptimized(num,1);
        System.out.println(isPerfectSquare);
    }

    private static boolean isPerfectSquare(int num,int low,int high){
        if(high<low)
            return false;

        int mid = low + (high - low)/2;
        int sqr = mid * mid;

        if(sqr == num){
            return true;
        }
        if(sqr > num){
            return isPerfectSquare(num,low,mid-1);
        }else {
            return isPerfectSquare(num,mid+1,high);
        }
    }

    private static  boolean isPerFectSquareNotOptimized(int num,int i){
        if(i*i>num){
            return false;
        }

        if(i*i == num){
            return true;
        }

        return isPerFectSquareNotOptimized(num,i+1);
    }


}
