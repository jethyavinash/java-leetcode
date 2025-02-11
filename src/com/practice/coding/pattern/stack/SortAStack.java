package com.practice.coding.pattern.stack;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);
        System.out.println("input: "+input);

        System.out.println("output:"+sortStack(input));
    }

    private static Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> tmpStack = new Stack<>();

        while (!input.isEmpty()){
            int tmp = input.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp){// until find right position
                input.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}
