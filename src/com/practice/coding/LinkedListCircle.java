package com.practice.coding;

public class LinkedListCircle {
    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);
        head.next.next.next.next.next = new ListNode1(6);
        head.next.next.next.next.next.next = new ListNode1(7);

        //head.next.next.next.next.next.next = head.next.next;
        System.out.println("Does it have circle: "+hasCircle(head));

    }

    private static boolean hasCircle(ListNode1 head) {
        ListNode1 fast = head;
        ListNode1 slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

class ListNode1{
    ListNode1 next;
    int val;
    public ListNode1(int val){
        this.val = val;
    }
}
