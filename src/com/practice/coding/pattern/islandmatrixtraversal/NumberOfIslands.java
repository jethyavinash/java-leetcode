package com.practice.coding.pattern.islandmatrixtraversal;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] matrixOfIsland = {{1,1,1,0,0},{0,1,0,0,1},{0,0,1,0,0}};
        int isLandCount = countOfIslands(matrixOfIsland);
        System.out.println(isLandCount);
    }

    private static int countOfIslands(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return 0;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int count = 0;
        for(int i = 0;i<rowLength;i++){
            for (int j = 0;j<colLength;j++){
                if(matrix[i][j] == 1){
                    count++;
                    dfs(matrix,i,j);
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] matrix,int i,int j){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 0)
            return;

        matrix[i][j] = 0;

        dfs(matrix,i-1,j); // up
        dfs(matrix,i+1,j);
        dfs(matrix,i,j-1);
        dfs(matrix, i,j+1);
    }
}
