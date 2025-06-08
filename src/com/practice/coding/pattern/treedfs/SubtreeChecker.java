package com.practice.coding.pattern.treedfs;

public class SubtreeChecker {
    public static void main(String[] args) {
        TreeNode source = new TreeNode(1);
        source.left = new TreeNode(2);
        source.right = new TreeNode(3);
        source.left.left = new TreeNode(4);

        TreeNode subTree = new TreeNode(2);
        subTree.left = new TreeNode(7);

        boolean isSubtree = isSubTree(source,subTree);
        System.out.println(isSubtree);
    }

    private static boolean isSubTree(TreeNode source, TreeNode subTree) {
        if(source == null)
            return false;

        if(isSame(source,subTree))
            return true;

        return isSubTree(source.left,subTree) || isSubTree(source.right,subTree);
    }

    private static boolean isSame(TreeNode source, TreeNode subTree) {
        if(source == null && subTree == null)
            return true;

        if(source == null || subTree == null)
            return true;

        if(source.val != subTree.val)
            return false;

        return isSame(source.left,subTree.left) && isSame(source.right,subTree.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

