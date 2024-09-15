package com.practice.coding;

public class MatrixRichestCustomer {
    public static void main(String[] args) {
        int[][] cutomerAccounts = {{10,100},{200,20},{30,300}};
        int result = wealthiestCustomer(cutomerAccounts);
        System.out.println(result);
    }

    private static int wealthiestCustomer(int[][] cutomerAccounts) {
        int maxBalance = 0;

        for(int i=0;i<cutomerAccounts.length;i++){
            int sum = 0;
            for(int j=0;j<cutomerAccounts[i].length;j++){
                sum=sum+cutomerAccounts[i][j];
            }

            maxBalance=Math.max(sum,maxBalance);
        }
        return maxBalance;
    }
}
