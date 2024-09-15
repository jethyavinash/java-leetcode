package com.practice.coding;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 64;
        int result = calulateSqrRoot(num);
        System.out.println(result);
    }

    private static int calulateSqrRoot(int num) {
        if(num < 2)
            return num;
        int left = 2;
        int right = num/2;
        while (left <= right){
            int pivot = left+(right-left)/2;
            int x = pivot*pivot;
            if(x > num){
                right = pivot-1;
            }else if(x<num){
                left = pivot+1;
            }else {
                return pivot;
            }
        }
        return right;
    }
}
