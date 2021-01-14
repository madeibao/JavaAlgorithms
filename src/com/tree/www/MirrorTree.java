package com.tree.www;

/**
 * @program: JavaWorkSpace2->MirrorTree
 * @description: 翻转等价的二叉树内容
 * @author: MaYuan
 * @create: 2020-01-12 20:25
 * @version: 1.0
 **/
public class MirrorTree {
    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) || flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right1 = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right1;

        TreeNode binTree2 = new TreeNode(15);
        TreeNode left2 = new TreeNode(14);
        TreeNode right2 = new TreeNode(13);
        binTree.left = left2;
        binTree.right = right2;

        System.out.println(flipEquiv(binTree, binTree2));
    }
}
