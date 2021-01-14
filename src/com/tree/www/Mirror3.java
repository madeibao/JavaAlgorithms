package com.tree.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Mirrored
 * @Author：Mayuan
 * @Date 2020/3/24 11:07
 * @Description TODO
 * @Version 1.0
 * <p>
 * 将一颗二叉树的内容进行左右的交换
 * 层次遍历来实现二叉树的遍历。
 **/
public class Mirror3 {

    private static TreeNode mirror(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 首先来构建一个队列结构
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp;
        while (!queue.isEmpty()) {
            TreeNode temp2 = queue.poll();

            temp = temp2.left;
            temp2.left = temp2.right;
            temp2.right = temp;

            if (temp2.left != null) {
                queue.add(temp2.left);
            }
            if (temp2.right != null) {
                queue.add(temp2.right);
            }
        }
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
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        TreeNode l6 = new TreeNode(6);
        TreeNode l7 = new TreeNode(7);
        TreeNode l8 = new TreeNode(8);
        TreeNode l9 = new TreeNode(9);
        TreeNode ll0 = new TreeNode(10);
        TreeNode ll1 = new TreeNode(11);
        TreeNode ll2 = new TreeNode(12);
        TreeNode ll3 = new TreeNode(13);
        TreeNode ll4 = new TreeNode(14);
        TreeNode ll5 = new TreeNode(15);


        root.left = l2;
        root.right = l3;

        l2.left = l4;
        l2.right = l5;

        l3.left = l6;
        l3.right = l7;

        l4.left = l8;
        l4.right = l9;

        l5.left = ll0;
        l5.right = ll1;

        l6.left = ll2;
        l6.right = ll3;

        l7.left = ll4;
        l7.right = ll5;
        TreeNode temp = mirror(root);
        preOrder(temp);
    }
}


