package com.practice.coding;

public class SquaringSortedArray {
    public static void main(String[] args) {
        int[] result = makeSquares(new int[] { -7,-3,2,3,11 });
        for (int num : result)
            System.out.print(num + " ");
    }

    private static int[] makeSquares(int[] numArr) {
        int length = numArr.length;
        int[] newNumArr = new int[length];

        int left = 0;
        int right = length-1;
        int highestIndex = length-1;
        while (left<=right){
            int leftSqr = numArr[left] * numArr[left];
            int rightSqr = numArr[right] * numArr[right];

            if(leftSqr>rightSqr){
                newNumArr[highestIndex] = leftSqr;
                left++;
                highestIndex--;
            }else{
                newNumArr[highestIndex] = rightSqr;
                right--;
                highestIndex--;
            }
        }
        return newNumArr;
    }
}
