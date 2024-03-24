package com.tree.www;

import java.util.ArrayList;

/**
 * @program: JavaWorkSpace2->TreeToList
 * @description: 二叉树变成链表的内容
 * @author: MaYuan
 * @create: 2020-02-11 17:39
 * @version: 1.0
 **/
public class TreeToList {
    public static void flatten(TreeNode root) {
        while (root != null) {
            //左子树为 null，直接考虑下一个节点
            if (root.left == null) {
                root = root.right;
            }
            else {
                // 找左子树最右边的节点
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                //将原来的右子树接到左子树的最右边节点
                pre.right = root.right;
                // 将左子树插入到右子树的地方
                root.right = root.left;
                root.left = null;
                // 考虑下一个节点
                root = root.right;
            }
        }
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

        TreeNode n1 = new TreeNode(1);
        TreeNode nl2 = new TreeNode(2);
        TreeNode nr2 = new TreeNode(5);
        TreeNode nll3 = new TreeNode(3);
        TreeNode nlr4 = new TreeNode(4);
        TreeNode nrr5 = new TreeNode(6);

        n1.left = nl2;
        n1.right = nr2;

        nl2.left = nll3;
        nl2.right = nlr4;
        nr2.right = nrr5;

        flatten(n1);
        preOrder(n1);
    }
}
