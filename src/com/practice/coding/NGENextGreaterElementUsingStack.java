package com.practice.coding;

import java.util.Arrays;
import java.util.Stack;

public class NGENextGreaterElementUsingStack {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,2,6,8};
        int[] result = ngeArr(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] ngeArr(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1;i>=0;i--){
            while (!stack.isEmpty() && arr[i] >= stack.peek()){
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
