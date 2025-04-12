package com.practice.coding.pattern.bitwisexor;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] num = {1, 4, 2, 1, 3, 2, 3};
        int singleNum = findSingleNum(num);
        System.out.println(singleNum);
    }

    private static int findSingleNum(int[] num) {
        int xor = 0;
        for (int i = 0; i < num.length; i++){
            xor ^= num[i];
        }
        return xor;
    }
}
