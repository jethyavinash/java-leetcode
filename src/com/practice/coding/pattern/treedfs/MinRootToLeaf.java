package com.practice.coding.pattern.treedfs;

import javax.swing.tree.TreeNode;

public class MinRootToLeaf {
    private static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);

        root.right.left = new TreeNode(12);

        int minSum = findMinOfRootToLeaf(root);
        System.out.println(minSum);
    }

    private static int findMinOfRootToLeaf(TreeNode root){
        if(root == null)
            return Integer.MAX_VALUE;

        if(root.left == null && root.right == null)
            return root.val;

        int leftSum = findMinOfRootToLeaf(root.left);
        int rightSum = findMinOfRootToLeaf(root.right);

        return root.val + Math.min(leftSum,rightSum);
    }
}
