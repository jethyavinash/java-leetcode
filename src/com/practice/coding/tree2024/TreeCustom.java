package com.practice.coding.tree2024;

import java.util.ArrayList;
import java.util.List;

public class TreeCustom<T extends Comparable<T>> {
    List<T> sortedNodes = new ArrayList<>();
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

    private Integer heightOfTree(Node<T> root) {
        if(root == null){
            return 0;
        }

        int heightOfLeftSubtree = heightOfTree(root.left);
        int heightOfRightSubtree = heightOfTree(root.right);
        return 1 + Math.min(heightOfLeftSubtree, heightOfRightSubtree);
    }

    public Node<T> getRoot(){
        return root;
    }

    public static void main(String[] args) {
        TreeCustom<Integer> treeCustom = new TreeCustom<>();
        treeCustom.insert(1);
        treeCustom.insert(2);
        treeCustom.insert(6);
        treeCustom.insert(9);
        treeCustom.insert(12);
        treeCustom.insert(15);
        treeCustom.insert(18);
        //treeCustom.inOrderTraversal();
        //treeCustom.preOrderTraversal();
        //treeCustom.postOrderTraversal();
        //System.out.println(treeCustom.search(8));
        //int heightOfTree = treeCustom.heightOfTree(treeCustom.getRoot());
        //boolean isBalanced = treeCustom.isBalancedBinaryTree(treeCustom.getRoot());
        //int minDiff = treeCustom.minDiffBetNodes(treeCustom.getRoot());
        int sumRange = rangeSumBST(treeCustom.getRoot(),5,17);
        System.out.println(sumRange);


    }

    private static int rangeSumBST(Node<Integer> root,Integer low,Integer high) {

        if(root == null)
            return 0;

        int sum = 0;
        if(root.data > low){
            sum+=rangeSumBST(root.left, low, high);
        }

        if(root.data>=low && root.data<=high){
            sum += root.data;
        }
        if(root.data < high){
            sum+=rangeSumBST(root.right, low, high);
        }
        return sum;
    }

    private int minDiffBetNodes(Node<T> root) {
        sortedNodes.clear();
        inOrderTraversalWithList(root);
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i< sortedNodes.size();i++){
            Integer next  = (Integer) sortedNodes.get(i);
            Integer curr =  (Integer) sortedNodes.get(i-1);
            min = Math.min(min,next-curr);
        }
        return min;

    }

    private void inOrderTraversalWithList(Node<T> root) {
        if(root == null){
            return;
        }
        inOrderTraversalWithList(root.left);
        sortedNodes.add(root.data);
        inOrderTraversalWithList(root.right);
    }

    private static boolean isBalancedBinaryTree(Node<Integer> root) {
        return depth(root) != -1;
    }

    private static int depth(Node<Integer> root) {
        if(root == null){
            return 0;
        }

        int leftHeight = depth(root.left);
        if(leftHeight == -1)
            return -1;

        int rightHeight = depth(root.right);
        if(rightHeight == -1)
            return -1;

        if(Math.abs(leftHeight-rightHeight) > 1){
            return -1;
        }

        return Math.max(leftHeight, rightHeight)+1;
    }


}
