package com.practice.coding;

import java.util.*;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] input = {4, 5, 2, 25};
        List<Integer> result = nextGreater(input);
        System.out.println(result);
    }

    private static List<Integer> nextGreater(int[] input) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i = input.length-1; i>=0 ; i--){
            while (!stack.isEmpty() && input[i] >= stack.peek()){
                stack.pop();
            }

            list.add(stack.isEmpty()? -1 : stack.peek());

            stack.push(input[i]);

        }
        Collections.reverse(list);
        return list;
    }


}
