package com.tree.www;

/**
 * @program: JavaWorkSpace2->UniqueTreeNumber
 * @description: 单一数值的二叉树的内容
 * @author: MaYuan
 * @create: 2020-01-12 21:46
 * @version: 1.0
 **/
public class UniqueTreeNumber {
    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != root.val) {
            return false;
        }
        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        // 递归判断左右的两个方面内容。
        return isUnivalTree(root.right) && isUnivalTree(root.left);
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(15);
        TreeNode right = new TreeNode(15);
        binTree.left = left1;
        binTree.right = right;

        System.out.println(isUnivalTree(binTree));
    }
}
