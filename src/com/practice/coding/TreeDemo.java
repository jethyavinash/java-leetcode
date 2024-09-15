package com.practice.coding;

public class TreeDemo<T extends Comparable<T>> {
    Node<T> root = null;
    public TreeDemo(T value){
        root = new Node<>(value);
    }

   public void insert(T value){
        Node<T> newNode = new Node<>(value);
        Node<T> current = this.root;
        Node<T> parent = null;
        while (current != null){
            parent = current;
            if(value.compareTo(current.value) < 0){
                current = current.left;
            }else{
                current = current.right;
            }
        }

        if(value.compareTo(parent.value) < 0){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }
   }

    public static void main(String[] args) {
        TreeDemo<Integer> treeDemo = new TreeDemo<>(6);
        treeDemo.insert(2);
        treeDemo.insert(1);
        treeDemo.insert(3);
        treeDemo.insert(5);
        treeDemo.insert(4);

        System.out.println(treeDemo);



    }
}

class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
