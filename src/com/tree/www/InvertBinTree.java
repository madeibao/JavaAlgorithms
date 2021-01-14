package com.tree.www;

import java.util.ArrayList;

/**
 * @program: JavaWorkSpace2->InvertBinTree
 * @description: 转置二叉树的内容
 * @author: MaYuan
 * @create: 2020-02-11 16:47
 * @version: 1.0
 **/
public class InvertBinTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


        if (root.left != null) {
            invertTree(root.left);
        }
//            invertTree(root.left);
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(root.val);
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;
        TreeNode binTree2 = invertTree(binTree);
        preOrder(binTree2);
    }
}
