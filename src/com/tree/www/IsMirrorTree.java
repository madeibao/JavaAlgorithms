package com.tree.www;

/**
 * @program: JavaWorkSpace2->IsMirrorTree
 * @description: 判断二叉树是否为对称的二叉树的内容
 * @author: MaYuan
 * @create: 2019-12-31 19:23
 * @version: 1.0
 **/
public class IsMirrorTree {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && (isMirror(t1.right, t2.left)) && (isMirror(t1.left, t2.right));
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(14);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        System.out.println(isSymmetric(binTree));
    }
}
