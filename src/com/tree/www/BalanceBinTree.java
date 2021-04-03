package com.tree.www;

/**
 * @program: Pro1->BalanceBinTree
 * @description: 判断二叉树是否平衡
 * @author: MaYuan
 * @create: 2019-12-23 20:03
 * @version: 1.0
 **/


public class BalanceBinTree {

    private static boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }

        // 左右的高度差大于1,则返回错误节点。
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }

    /**
     * 首先获得二叉树的左右子树的高度。
     */
    private static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(1);
        TreeNode r2 = new TreeNode(1);
        root.left = l2;
        root.right = r2;
        System.out.println(isBalance(root));
    }
}



