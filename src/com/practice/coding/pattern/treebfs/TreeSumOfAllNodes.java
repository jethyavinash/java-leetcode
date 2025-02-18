package com.practice.coding.pattern.treebfs;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSumOfAllNodes {
    private static class TreeNode{
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        int sumOfAllNodes = findSumOfAllNodes(root);
        System.out.println(sumOfAllNodes);
    }

    private static int findSumOfAllNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            sum += node.val;

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }
        }
        return sum;
    }
}
