package com.practice.coding.pattern.bitwisexor;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,6}; int n = 6;
        int missing = findMissingNum(num,n);
        System.out.println(missing);
    }

    private static int findMissingNum(int[] num,int n){
        int xor1 = 0;
        int xor2 = 0;
        for(int i=1;i<=n;i++){
            xor1 = xor1^i;
        }

        for(int i=0;i<num.length;i++){
            xor2 = xor2^num[i];
        }

        return xor1 ^ xor2;
    }
}
