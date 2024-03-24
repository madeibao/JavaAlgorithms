package com.tree.www;

/**
 * @program: JavaWorkSpace2->MergeTree
 * @description: 合并两个二叉树
 * @author: MaYuan
 * @create: 2020-01-14 21:37
 * @version: 1.0
 **/
public class MergeTree {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }

    private static void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        else {
            midOrder(root.left);
            System.out.print(root.val + " ");
            midOrder(root.right);
        }
    }

    public static void main(String[] args) {

        TreeNode root2 = new TreeNode(1);
        TreeNode newf2 = new TreeNode(3);
        TreeNode newr2 = new TreeNode(2);
        TreeNode newf3 = new TreeNode(5);

        root2.left = newf2;
        root2.right = newr2;
        newf2.left = newf3;

        TreeNode root3 = new TreeNode(2);
        TreeNode leafl2 = new TreeNode(1);
        TreeNode leafr2 = new TreeNode(3);
        TreeNode leafl3 = new TreeNode(4);
        TreeNode leafr3 = new TreeNode(7);

        root3.left = leafl2;
        root3.right = leafr2;

        leafl2.right = leafl3;
        leafr2.right = leafr3;

        TreeNode root4 = mergeTrees(root2, root3);
        midOrder(root4);
    }
}
