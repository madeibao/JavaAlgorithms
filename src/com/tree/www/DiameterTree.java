package com.tree.www;

/**
 * @ClassName DiameterTree
 * @Author：Mayuan
 * @Date 2020/3/4 11:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的直径
 * 求出二叉树中的最远的两个节点之间的距离。
 *
 **/

public class DiameterTree {

    /**
     * 设置全局变量内容。
     */
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        res = Math.max(res, getDepth(root.left) + getDepth(root.right));
        return res;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(14);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(15);
        binTree.left = left1;
        binTree.right = right;

        System.out.println(new DiameterTree().diameterOfBinaryTree(binTree));

    }
}
