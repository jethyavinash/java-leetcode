package com.practice.coding;

public class SolutionLinkedList {
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    private Node head;
    private class Node{
        int data;
        Node next;
        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    public int delete(int key)  {
        int found = -1;
        Node temp = null; Node prev = null;
        if(head.data == key){
            found = head.data;
            head = head.next;
        }else{
            while (temp.data != key){
                prev = temp;
                temp = temp.next;
            }
            if(temp == null) return -1;

            found = temp.data;
            prev = temp.next;
            temp = null;
        }
        return found;
    }

    public int search(int key){
        int found = -1;
        if(head != null && head.data == key){
            found = head.data;
        }
        Node currNode = head;
        while (currNode != null && currNode.data != key){
            currNode = currNode.next;
        }

        if(currNode != null){
            found = currNode.data;
        }

        return found;
    }

    public Node reverseLinkedList(){
        Node prev = null;
        Node current = head;
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node removeDuplicate(){
        Node prev = null;
        Node current = head;

        while (current != null){
            if(prev != null && prev.data == current.data){
                current = current.next;
                prev.next = current;
            }else{
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    private void merge(SolutionLinkedList linkedList2) {
        Node n1 = this.head;
        Node n2 = linkedList2.head;

        while (n1 != null || n2 != null ){
            
        }

    }

    public static void main(String[] args) {
        SolutionLinkedList linkedList1 = new SolutionLinkedList();
        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(6);

        SolutionLinkedList linkedList2 = new SolutionLinkedList();
        linkedList2.insert(3);
        linkedList2.insert(7);
        linkedList2.insert(8);
        linkedList2.insert(9);
        linkedList2.insert(10);




        //System.out.println(linkedList1.delete(1));
        //System.out.println(linkedList1.search(3));

        //linkedList1.removeDuplicate();
        linkedList1.merge(linkedList2);
    }




}
