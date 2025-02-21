package com.practice.coding.pattern.treebfs;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class TreeLevelOrderTraversal {
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
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrderTraversal(root);
        result.forEach((innerList) -> {
            System.out.println(innerList.stream().map(String::valueOf).collect(Collectors.joining(",","[","]")));
        });

    }

    private static List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0;i< levelSize;i++){
                TreeNode levelNode = queue.poll();
                levelList.add(levelNode.val);
                if(levelNode.left != null)
                    queue.add(levelNode.left);
                if(levelNode.right != null)
                    queue.add(levelNode.right);
            }

            result.add(levelList);
        }
        return result;
    }
}
