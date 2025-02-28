package com.practice.coding.pattern.treebfs;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrderSuccessor {
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
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int successor = findSuccessor(7,root);
        System.out.println(successor);
    }

    private static int findSuccessor(int input,TreeNode root){
        int successor = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);

            if(node.val == input)
                break;
        }
        successor = queue.peek().val;
        return successor;
    }
}
