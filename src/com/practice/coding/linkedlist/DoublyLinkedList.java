package com.practice.coding.linkedlist;

public class DoublyLinkedList<T> {
    Node<T> head;
    private static class Node<T>{
        T val;
        Node<T> prev;
        Node<T> next;
        Node(T val){
            this.val = val;
            prev = next = null;
        }
    }

    public void insertFirst(T val){
        Node<T> newNode = new Node<>(val);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAfter(Node<T> prev,T item){
        Node<T> newNode = new Node<>(item);
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }
    public void delete(T val){

    }

    public boolean search(T key){
        return false;
    }
    public boolean isPalimdrom(Node<T> head){
        Node<T> curr = head;
        while (curr.next != null){
            curr = curr.next;
        }

        Node<T> start = head;
        Node<T> end = curr;

        while (start != end && start.prev != end){
            if(start.val != end.prev){
                return false;
            }
            start = start.next;
            end = end.prev;
        }

    return true;
    }
}
