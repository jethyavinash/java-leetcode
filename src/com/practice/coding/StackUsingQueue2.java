package com.practice.coding;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue2 {
    private static class Stack{
        private Queue<Integer> main;
        private Queue<Integer> aux;

        public Stack(){
            main = new LinkedList<>();
            aux = new LinkedList<>();
        }

        public void push(Integer item){
            aux.offer(item);
            while (!main.isEmpty()){
                aux.offer(main.poll());
            }
            swap(main,aux);
        }

        private void swap(Queue<Integer> main,Queue<Integer> aux){
            Queue<Integer> temp = main;
            this.main = aux;
            this.aux = temp;
        }

        public Integer pop(){
            return main.poll();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
