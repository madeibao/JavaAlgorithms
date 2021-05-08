package com.tree.www;

/**
 * @ClassName SymmetricTree
 * @Author：Mayuan
 * @Date 2020/11/13 18:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为对称的二叉树的值。
 **/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2) {

        /// 首先是与，判断两个内容是否都为空的结果值。
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && (isMirror(t1.right, t2.left)) && (isMirror(t1.left, t2.right));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode l2 = new TreeNode(2);
        root.left = l2;
        root.right = r2;

        System.out.println(new SymmetricTree().isSymmetric(root));
    }
}
