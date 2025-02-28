package com.practice.coding.pattern.treebfs;

import com.practice.coding.TestNull;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMinimumDepth {
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
        //root.right.left = new TreeNode(6);
        //root.right.right = new TreeNode(7);

        int minDepth = findMinDepth(root);
        System.out.println(minDepth);
    }

    private static int findMinDepth(TreeNode root){
        int minDepth = 0;
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            minDepth++;
            int levelSize = queue.size();
            for(int i = 0;i<levelSize;i++){
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return minDepth;
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return minDepth;
    }

}
