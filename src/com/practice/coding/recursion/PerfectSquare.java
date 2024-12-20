package com.practice.coding.recursion;

public class PerfectSquare {
    public static void main(String[] args) {
        boolean isPerfectSqr = isPerfectSquare(15,1);
        System.out.println(isPerfectSqr);
    }

    private static boolean isPerfectSquare(int num,int subtractor){
        if(num == 0)
            return true;

        if(num < 0)
            return false;

        return isPerfectSquare(num-subtractor,subtractor+2);
    }
}
