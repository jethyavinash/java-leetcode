package com.practice.coding;

public class RichestCustWealth {
    public static void main(String[] args) {
        int[][] custAccountMatrix = {{10,100},{20,200},{30,300}};
        int highestBalance = findHighestBalance(custAccountMatrix);
        System.out.println(highestBalance);
    }

    private static int findHighestBalance(int[][] custAccountMatrix) {
        int maxBalance = 0;
        for(int i=0;i<custAccountMatrix.length;i++){
            int ithCustSalary = 0;
            for(int j=0;j<custAccountMatrix[j].length;j++){
                ithCustSalary+=custAccountMatrix[i][j];
            }
            maxBalance = Math.max(maxBalance,ithCustSalary);
        }
        return maxBalance;
    }
}
