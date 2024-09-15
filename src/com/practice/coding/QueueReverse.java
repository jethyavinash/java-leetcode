package com.practice.coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");

        Queue<String> revereseQueue = reverseQueue(queue);
        System.out.println(queue);
    }

    private static Queue<String> reverseQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.add(queue.poll());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }
}
