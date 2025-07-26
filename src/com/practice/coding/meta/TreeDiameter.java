package com.practice.coding.meta;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.left = null;
        this.right = null;
        this.val = val;
    }
}
public class TreeDiameter {
    static int maxDiameter = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int diameter = findDiameter(root);
        System.out.println(diameter);
    }

    private static int findDiameter(TreeNode root) {
        if(root == null)
            return 0;
        height(root);
        return maxDiameter;
    }

    private static int height(TreeNode node){
            if(node == null)
                return 0;

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            int currDiameter = leftHeight + rightHeight + 1;
            maxDiameter = Math.max(maxDiameter,currDiameter);

            return Math.max(leftHeight,rightHeight)+1;
    }
}

