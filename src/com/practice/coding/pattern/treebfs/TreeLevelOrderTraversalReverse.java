package com.practice.coding.pattern.treebfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class TreeLevelOrderTraversalReverse {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
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

        List<List<Integer>> result = reverseBFS(root);
        result.forEach((list) -> {
            System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(",","{","}")));
        });

    }

    private static List<List<Integer>> reverseBFS(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int lengthOfLevel = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i =0;i<lengthOfLevel;i++){
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(0,levelList);
        }

        return result;

    }
}
