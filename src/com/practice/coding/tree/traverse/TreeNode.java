package com.practice.coding.tree.traverse;

import java.util.List;

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode(int x) {
     val = x;
   }

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = sol.traverse1(root);
        System.out.println("Level order traversal: " + result);
    }
 };