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

    public void insertAfterSpecified(T prevData,T newData){
        Node<T> curr = head;
        while (curr != null && !curr.val.equals(prevData)){
            curr = curr.next;
        }
        if(curr == null){
            return;
        }
        Node<T> newNode = new Node<>(newData);
        newNode.next = curr.next;
        curr.next = newNode;
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

    public void display(Node<T> head){
        Node<T> curr = head;
        StringBuilder values = new StringBuilder();
        while (curr != null){
            values.append(curr.val + "|");
            curr = curr.next;
        }
        System.out.println("values of the linkedlist are: "+values);
    }

    public void reverse(){
        Node<T> curr = head;
        Node<T> prev = null;
        while (curr != null){
            Node<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeDuplicate(){
        Node<T> curr = head;
        while (curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> l1 = new SingleLinkedList();
        l1.insertAtEnd(1);
        l1.insertAtEnd(5);
        l1.insertAtEnd(7);

        SingleLinkedList<Integer> l2 = new SingleLinkedList();
        l2.insertAtEnd(2);
        l2.insertAtEnd(5);
        l2.insertAtEnd(8);

        Node<Integer> mergeNode = mergeSorted(l1.head,l2.head);
        l1.display(mergeNode);
        //linkedList.insertAfterSpecified("b", "z");

        //linkedList.insertAtFront("0");
        //linkedList.delete("a");
        //System.out.println(linkedList.search("j"));
        //linkedList.removeDuplicate();
        //linkedList.display();
        //linkedList.reverse();
        //linkedList.display();

    }

    private static Node<Integer> mergeSorted(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> dummy = new Node<>(-1);
        Node<Integer> curr = dummy;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 == null){
            curr.next = l2;
        }else {
            curr.next = l1;
        }
        return dummy.next;
    }

}
