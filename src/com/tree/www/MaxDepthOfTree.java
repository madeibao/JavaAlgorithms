package com.tree.www;

/**
 * @program: JavaWorkSpace2->MaxDepthOfTree
 * @description: 二叉树的最大的深度
 * @author: MaYuan
 * @create: 2019-12-29 18:37
 * @version: 1.0
 **/

public class MaxDepthOfTree {
    public static int maxDepth(TreeNode root) {
//        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return root != null ? Math.max(maxDepth(root.left), maxDepth(root.right)) + 1 : 0;
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;
        System.out.println(maxDepth(binTree));
    }
}