package com.practice.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(8);
        queue.offer(4);
        queue.offer(5);
        Queue<Integer> reveredQueue = reverseQueue(queue);
        System.out.println(reveredQueue);
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> revQueue = new LinkedList<>();
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()){
            revQueue.offer(stack.pop());
        }
        return revQueue;
    }
}
