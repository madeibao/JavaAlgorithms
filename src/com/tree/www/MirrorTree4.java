package com.tree.www;

/**
 * @ClassName MirrorTree4
 * @Author：Mayuan
 * @Date 2020/12/8/0008 19:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 翻转二叉树。
 **/
public class MirrorTree4 {

    private static TreeNode mirror(TreeNode root) {

        if (root == null) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }


    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {

        TreeNode binTree = new TreeNode(14);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(15);
        binTree.left = left1;
        binTree.right = right;

        TreeNode temp = mirror(binTree);
        preOrder(temp);
    }
}
