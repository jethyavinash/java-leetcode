package com.practice.coding;

import java.util.Arrays;

public class MatrixMaxOnes {
    public static void main(String[] args) {
        int[][] input = {{1, 1, 1},{0, 0, 1},{1, 1, 0}};
        int[] result = findMaxOnes(input);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findMaxOnes(int[][] input) {
        int maxOnesIndex = 0;
        int maxOnesCount = 0;

        for(int i=0;i<input.length;i++){
            int rowOnesCount = 0;
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] == 1){
                    rowOnesCount++;
                }
            }
            if(maxOnesCount<rowOnesCount){
                maxOnesCount=rowOnesCount;
                maxOnesIndex=i;
            }
        }
        return new int[]{maxOnesIndex,maxOnesCount};
    }
}
