package com.practice.coding.pattern.monotonicstack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4, 2, 6};
        int[] num2 = {6, 2, 4, 5, 3, 7};
        int[] result = nextGreaterElement(num1,num2);
        System.out.println(Arrays.toString(result));
    }
    private static int[] nextGreaterElement(int[] num1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<num2.length;i++){
            while (!stack.isEmpty() && stack.peek()  < num2[i]){
                map.put(stack.pop(),num2[i]);
            }
            stack.push(num2[i]);
        }
        int[] result = new int[num1.length];
        for(int j = 0; j < num1.length;j++){
            result[j] = map.get(num1[j]);
        }
        return result;
    }
}
