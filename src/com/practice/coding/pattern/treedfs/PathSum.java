package com.practice.coding.pattern.treedfs;

public class PathSum {
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

        boolean hasPathSum = isHavingPathSum(root,18);
        System.out.println(hasPathSum);
    }

    private static boolean isHavingPathSum(TreeNode root,int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return sum == root.val;
        }

        sum = sum - root.val;
        return isHavingPathSum(root.left,sum) || isHavingPathSum(root.right,sum);
    }
}
