package com.practice.coding.pattern.treebfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelAvg {
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Double> result = levelAvgOfBinaryTree(root);
        System.out.println(result);
    }

    private static List<Double> levelAvgOfBinaryTree(TreeNode root){
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            double levelSum = 0;
            for(int i = 0 ; i< levelSize ;i++){
                TreeNode levelNode = queue.poll();
                levelSum+=levelNode.val;
                if(levelNode.left != null){
                    queue.add(levelNode.left);
                }
                if(levelNode.right != null){
                    queue.add(levelNode.right);
                }
            }
            result.add(levelSum / levelSize);
        }
        return result;
    }
}
