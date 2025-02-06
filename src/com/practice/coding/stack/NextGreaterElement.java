package com.practice.coding.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 7, 8, 6, 10};
        int[] result = nextGreaterElement(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = arr.length - 1;i>=0 ;i--){
            int currentElement = arr[i];

            while (!stack.isEmpty() && stack.peek() <= currentElement){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i] = -1;
            }else {
                result[i] = stack.peek();
            }

            stack.push(currentElement);
        }
        return result;
    }
}
