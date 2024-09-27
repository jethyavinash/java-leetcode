package com.practice.coding;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int diagonalSum = matrixDiagonalSum(matrix);
        System.out.println(diagonalSum);
    }

    private static int matrixDiagonalSum(int[][] matrix) {
        int length = matrix.length;
        int diagonalSum = 0;
        for(int i =0;i<matrix.length;i++){
            diagonalSum += matrix[i][i]+matrix[i][length-1-i];
        }
        if(length % 2 != 0){
            diagonalSum-=matrix[length/2][length/2];
        }
        return diagonalSum;
    }
}
