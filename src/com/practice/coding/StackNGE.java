package com.practice.coding;

import java.util.Arrays;
import java.util.Stack;

public class StackNGE {
    public static void main(String[] args) {
        int[] arr = {1,5,2,9};
        int[] res = ngeStack(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] ngeStack(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
