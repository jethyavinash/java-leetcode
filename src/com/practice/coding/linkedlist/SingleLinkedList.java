package com.practice.coding.linkedlist;

public class SingleLinkedList<T> {
    private Node<T> head;
    private static class Node<T> {
        private T val;
        private Node<T> next;
        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }

    public void insertAtFront(T item){
        Node<T> newNode = new Node<>(item);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(T item){
        Node<T> newNode = new Node<>(item);
        if(head == null){
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public void delete(T item){
        Node<T> temp = head;
        Node<T> prev = null;
        if(temp != null && temp.val.equals(item)){
            head = temp.next;
            return;
        }
        while (temp != null && !temp.val.equals(item)){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        prev.next = temp.next;
    }
    public boolean search(T item){
        Node<T> curr = head;
        while (curr != null){
            if(curr.val == item){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void display(){
        Node<T> curr = head;
        StringBuilder values = new StringBuilder();
        while (curr != null){
            values.append(curr.val + "|");
            curr = curr.next;
        }
        System.out.println("values of the linkedlist are: "+values);
    }

    public static void main(String[] args) {
        SingleLinkedList<String> linkedList = new SingleLinkedList();
        linkedList.insertAtEnd("a");
        linkedList.insertAtEnd("b");
        linkedList.insertAtEnd("c");

        linkedList.insertAtFront("0");
        linkedList.delete("a");
        System.out.println(linkedList.search("j"));
        linkedList.display();
    }

}
