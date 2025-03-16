package com.practice.coding.pattern.islandmatrixtraversal;

public class LargestIsland {
    public static void main(String[] args) {
        int[][] isLands = { {0, 0, 1, 0, 1},
                            {1, 1, 1, 0, 0},
                            {0, 0, 1, 1, 1},
                            {0, 0, 0, 1, 0}
                            };

        System.out.println("Largest island size: "+largestIsLandSize(isLands));
    }

    private static int largestIsLandSize(int[][] isLands){
        int largestIsLandSize = 0;

        int rowSize = isLands.length;
        int colSize = isLands[0].length;

        for(int i = 0; i < rowSize ; i++){
            for(int j = 0; j < colSize ; j++){
                if(isLands[i][j] == 1){
                    largestIsLandSize = Math.max(largestIsLandSize,dfs(isLands,i,j));
                }
            }
        }
        return largestIsLandSize;
    }

    private static int dfs(int[][] isLands, int i , int j){
        if(i < 0 || i >= isLands.length || j < 0 || j >= isLands[0].length || isLands[i][j] == 0){
            return 0;
        }

        isLands[i][j] = 0;
        int size = 1;

        size += dfs(isLands,i+1,j);
        size += dfs(isLands,i-1,j);
        size += dfs(isLands,i,j+1);
        size += dfs(isLands,i,j-1);

        return size;
    }
}
