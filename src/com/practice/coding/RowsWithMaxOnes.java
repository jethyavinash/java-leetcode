package com.practice.coding;

import java.util.Arrays;

public class RowsWithMaxOnes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {0, 1, 1}, {1, 1, 1}};
        int[] result = findMaxOnes(matrix);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findMaxOnes(int[][] matrix) {
        int maxOnes = -1;
        int maxRow = -1;
        for(int i = 0;i<matrix.length;i++){
            int countOnes = 0;

            for (int j = 0;j<matrix[i].length;j++){
                countOnes+=matrix[i][j];
            }
            if(countOnes > maxOnes){
                maxOnes = countOnes;
                maxRow = i;
            }
        }
        return new int[]{maxOnes,maxRow};
    }
}
