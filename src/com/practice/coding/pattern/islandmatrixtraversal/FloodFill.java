package com.practice.coding.pattern.islandmatrixtraversal;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1, 2},
                        {1, 1, 0, 2},
                        {1, 0, 2, 2},
                        {2, 2, 2, 2}};

        int startRow = 1;
        int startCol = 1;
        int newColor = 5;

        printImage(image,"before");

        floodFill(image,startRow,startCol,newColor);

        printImage(image,"after");
    }

    private static void printImage(int[][] image,String when){
        if(when.equals("before")){
            System.out.println("Before =====================================");
        }else {
            System.out.println("After =====================================");
        }
        Arrays.stream(image).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    private static void floodFill(int[][] image,int startRow,int startCol,int newColour){
        int oldColor = image[startRow][startCol];
        if(oldColor != newColour){
            dfs(image,startRow,startCol,newColour,oldColor);
        }
    }

    private static void dfs(int[][] image,int i,int j,int newColour,int oldColor){
        if(i < 0 || i >= image.length || j < 0 || j > image[0].length || oldColor != image[i][j]){
            return;
        }

        image[i][j] = newColour;

        dfs(image,i,j-1,newColour,oldColor);
        dfs(image,i,j+1,newColour,oldColor);
        dfs(image,i-1,j,newColour,oldColor);
        dfs(image,i+1,j-1,newColour,oldColor);
    }
}
