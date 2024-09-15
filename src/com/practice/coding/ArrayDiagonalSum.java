package com.practice.coding;

public class ArrayDiagonalSum {
    public static void main(String[] args) {
        //int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] array = {{1,2}, {4,5}};
        int result = sumOfDiagonal(array);
        System.out.println(result);
        //2,136,386
    }

    private static int sumOfDiagonal(int[][] array) {
        //05612-DAKEM-488Q2-0LCH2-8E060
        int result = 0;
        int length = array.length;
        for(int i=0,j=0;i<length;i++,j++){
            result = result+array[i][j]+array[i][length-1-i];
        }
        if(length%2!=0){
            int mid = Math.abs(length/2);
            result = result - array[mid][mid];
        }
        return result;
    }
}
