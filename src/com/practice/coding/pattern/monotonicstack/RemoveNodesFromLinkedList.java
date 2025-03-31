package com.practice.coding.pattern.monotonicstack;

import java.util.Stack;

public class RemoveNodesFromLinkedList {
    private static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(7);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        System.out.println("============ List before ========== ");
        printList(head);

        Node newHead = removeNodesWithGreaterAtRight(head);

        System.out.println("\n============ List after ========== ");
        printList(newHead);
    }

    private static Node removeNodesWithGreaterAtRight(Node head) {
        Node curr = head;
        Stack<Node> stack = new Stack<>();
        while (curr != null) {
            while(!stack.isEmpty() && stack.peek().data < curr.data){
                stack.pop();
            }

            if(!stack.isEmpty()){
                stack.peek().next = curr;
            }
            stack.push(curr);
            curr = curr.next;
        }
        return stack.isEmpty() ? null : stack.get(0);
    }
    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }
}
