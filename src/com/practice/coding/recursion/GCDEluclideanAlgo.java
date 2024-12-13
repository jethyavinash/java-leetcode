package com.practice.coding.recursion;

public class GCDEluclideanAlgo {
    public static void main(String[] args) {
        int a = 13;
        int b = 16;
        int gcd = findGCD(a,b);
        System.out.println(gcd);
    }

    public static int findGCD(int a , int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a%b);
    }
}
