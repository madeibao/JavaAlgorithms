package com.tree.www;

/**
 * @program: Pro1->BinTreeDepth
 * @description: 二叉树的深度
 * @author: MaYuan
 * @create: 2019-12-23 19:58
 * @version: 1.0
 **/
public class BinTreeDepth {
    /**
     * 求一个二叉树的深度
     */
    private static int getDepth(TreeNode root) {
        return root == null ? 0 : Math.max(getDepth(root.left), getDepth(root.right) + 1);
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(16);
        binTree.left = left1;
        binTree.right = right;
        System.out.println(getDepth(binTree));
    }
}










