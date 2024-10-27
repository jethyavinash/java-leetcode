package com.practice.coding.tree2024;

public class TreeCustom<T extends Comparable<T>> {
    private static class Node<T>{
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node<T> root;

    public void insert(T value){
        Node<T> node = new Node<>(value);
        if(root == null){
            root = node;
        }else{
            Node<T> current = root;
            Node<T> parent = null;
            while (current != null){
                parent = current;
                if(value.compareTo(current.data) < 0){
                    current = current.left;
                }else{
                    current = current.right;
                }
            }
            if(value.compareTo(parent.data) < 0){
                parent.left = node;
            }else {
                parent.right = node;
            }
        }
    }

    public boolean search(T value){
        Node<T> current = root;
        while (current != null){
            if(value.compareTo(current.data) == 0){
              return true;
            } else if(value.compareTo(current.data) < 0){
                current = current.left;
            }else {
                current = current.right;
            }
        }
        return false;
    }

    public Node<T> findMin(Node<T> root){
        if(root.left == null){
            return root;
        }
        return findMin(root);
    }

    public void inOrderTraversal(){
        inOrderUtil(root);
        System.out.println();
    }

    private void inOrderUtil(Node<T> node) {
        if(node != null){
            inOrderUtil(node.left);
            System.out.print(node.data+" ,");
            inOrderUtil(node.right);
        }
    }

    public void preOrderTraversal(){
        preOrderUtil(root);
        System.out.println();
    }

    private void preOrderUtil(Node<T> node) {
        if(node != null){
            System.out.print(node.data+" ,");
            preOrderUtil(node.left);
            preOrderUtil(node.right);
        }
    }

    public void postOrderTraversal(){
        postOrderUtil(root);
        System.out.println();
    }

    private void postOrderUtil(Node<T> node) {
        if(node != null){
            postOrderUtil(node.left);
            postOrderUtil(node.right);
            System.out.print(node.data+" ,");
        }
    }

    public static void main(String[] args) {
        TreeCustom<Integer> treeCustom = new TreeCustom<>();
        treeCustom.insert(5);
        treeCustom.insert(3);
        treeCustom.insert(7);
        treeCustom.insert(2);
        treeCustom.insert(4);
        treeCustom.insert(6);
        treeCustom.insert(8);
        treeCustom.inOrderTraversal();
        treeCustom.preOrderTraversal();
        treeCustom.postOrderTraversal();
        System.out.println(treeCustom.search(8));
    }

}
