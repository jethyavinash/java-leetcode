package com.practice.coding.meta;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,1,2},{5,4,1}};
        boolean isToeplitzMatrix = isToeplitzMatrix(matrix);
        System.out.println(isToeplitzMatrix);
    }

    private static boolean isToeplitzMatrix(int[][] matrix){
        for(int i = 0; i< matrix.length - 1 ; i++){
            for(int j = 0; j < matrix[i].length - 1 ; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
