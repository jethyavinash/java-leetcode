package com.practice.coding;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int popValue = stack.pop();
        System.out.println(popValue);

    }

    private static class Stack{
        Queue<Integer> main = new LinkedList<>();
        Queue<Integer> aux = new LinkedList<>();



        public void push(int item) {
            aux.add(item);
            while (!main.isEmpty()){
                aux.add(main.peek());
                main.poll();
            }
            swap(main,aux);
        }

        private void swap(Queue<Integer> main, Queue<Integer> aux) {
            Queue<Integer> temp = null;
            temp = main;
            main = aux;
            aux = temp;
        }

        public int pop() {
            int item = main.peek();
            main.poll();
            return item;
        }
    }
}
