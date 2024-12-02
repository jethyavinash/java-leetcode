package com.practice.coding.recursion;

public class PrintZeroToN {
    public static void main(String[] args) {
        printNumbersTail(10);
    }

    private static void printZeroToN(int num) {
        if(num < 0)
            return;
        printZeroToN(num-1);
        System.out.print(num+" ");
    }

    private static void printZeroToN2(int num){
        if(num > 0)
            printZeroToN(num-1);
        System.out.print(num+" ");
    }

    public static void printNumbersTail(int n) {
        if (n > 0) {
            System.out.print(n+" ");
            printNumbersTail(n - 1);
        }
    }

}
