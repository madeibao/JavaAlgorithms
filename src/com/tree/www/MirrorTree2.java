package com.tree.www;

/**
 * @ClassName MirrorTree2
 * @Author：Mayuan
 * @Date 2020/2/26 17:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一颗二叉树，然后返回二叉树的镜像。
 * 左右的节点来进行交换。
 **/
public class MirrorTree2 {

    private static TreeNode mirror(TreeNode root) {
        if (root == null) {
            return null;
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