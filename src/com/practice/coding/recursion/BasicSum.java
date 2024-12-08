package com.practice.coding.recursion;

public class BasicSum {
    public static void main(String[] args) {
        int N = 5;
        int result = basicSum(5);
        System.out.println(result);
    }

    private static int basicSum(int num) {
        if(num <=0 ){
            return 0;
        }

        return num + basicSum(num-1);
    }
}
