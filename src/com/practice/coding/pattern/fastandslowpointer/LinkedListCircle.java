package com.practice.coding.pattern.fastandslowpointer;

public class LinkedListCircle {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        boolean isCircular = isCircular(head);
        System.out.println(isCircular);
    }

    private static boolean isCircular(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}


class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
