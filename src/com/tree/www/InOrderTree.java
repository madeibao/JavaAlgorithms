package com.tree.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: JavaWorkSpace2->InOrderTree
 * @description: 二叉树的中序遍历情况
 * @author: MaYuan
 * @create: 2020-01-27 17:10
 * @version: 1.0
 **/

public class InOrderTree {

    private static List inorder(TreeNode root) {
        //用链表节点来存储着所有的值。
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 根节点。
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
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


        List<Integer> list2 = inorder(root);
        System.out.println(list2.toString());
    }
}
