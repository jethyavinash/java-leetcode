package com.practice.coding.pattern.inplacereversal;

import java.util.List;

public class ReverseLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+", ");
            temp = temp.next;
        }
        System.out.println("\n---------------------------------");
        ListNode revHead = reverseInPlace(head);
        temp = revHead;
        while (temp != null){
            System.out.print(temp.val+", ");
            temp = temp.next;
        }
    }

    private static ListNode reverseInPlace(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
