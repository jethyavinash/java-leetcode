package com.practice.coding.pattern.fastandslowpointer;

public class LinkedListMiddle {

    private static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int middleElement = findMiddleElement(head);
        System.out.println(middleElement);
    }

    private static int findMiddleElement(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null && fast.next != null){
            count++;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}

