package com.practice.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = treeTraversalBFSLevelOrder(root);
        System.out.println(result);
    }

    private static List<List<Integer>> treeTraversalBFSLevelOrder(TreeNode root) {
        if(root == null){
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize;i++){
                TreeNode currNode = queue.poll();
                currentLevel.add(currNode.value);

                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
class TreeNode {
    Integer value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

}
