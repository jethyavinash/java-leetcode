package com.practice.coding.recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 12;
        boolean isPrime = checkIfPrime(num, num/2);
        System.out.println(isPrime);
    }

    public static boolean checkIfPrime(int num,int divisor){
        if(num < 2)
            return false;

        if(divisor == 1)
            return true;

        if(num % divisor == 0)
            return false;

        return checkIfPrime(num,divisor/2);
    }
}
