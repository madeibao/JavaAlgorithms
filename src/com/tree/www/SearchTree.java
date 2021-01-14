package com.tree.www;

/**
 * @ClassName SearchTree
 * @Author：Mayuan
 * @Date 2020/6/9 21:59
 * @Description TODO
 * @Version 1.0
 * 一颗二叉搜索树的结果值。
 * <p>
 * 验证一颗二叉树是否为二叉搜索树。
 **/
public class SearchTree {
    public static boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return helper(root, min, max);
    }

    /**
     * 验证是否为二叉搜索树
     */

    public static boolean helper(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(1);
        TreeNode r3 = new TreeNode(3);

        r1.left = r2;
        r1.right = r3;
        System.out.println(isValidBST(r1));
    }
}
