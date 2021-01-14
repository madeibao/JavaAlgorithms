package com.tree.www;

/**
 * @program: JavaWorkSpace2->PreOrderTree
 * @description: 二叉树的先序遍历
 * @author: MaYuan
 * @create: 2020-01-02 21:17
 * @version: 1.0
 **/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PreOrderTree {

    //递归遍历的算法内容。
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

    //下面写一个非递归遍历的算法内容。
    //自定义一个栈的内容来进行非递归的遍历一颗二叉树的内容。
    private static void preOrder2(TreeNode root) {
        if (root == null) {
            return;
        }

        //链表来作为栈进行存储节点内容。
        LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();

        //把根节点加入到链表中。
        list2.addFirst(root);
        while (!list2.isEmpty()) {
            TreeNode temp = list2.removeFirst();
            System.out.print(temp.val + "  ");
            if (temp.left != null) {
                list2.addFirst(temp.left);
            }

            if (temp.right != null) {
                list2.addFirst(temp.right);
            }
        }
    }

    // 二叉树的中序遍历的内容。
    private static void midOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            midOrder(root.left);
            System.out.print(root.val + " ");
            midOrder(root.right);
        }
    }

    //中序遍历的非递归实现
    private static void midOrder2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                // 一直向左面走，直到叶子节点内容。
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                System.out.print(root.val + " ");
                root = root.right;
            }
        }
    }

    //后序遍历的实现内容。
    private static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    //后序遍历非递归。

    public static void postOrder2(TreeNode biTree) {//后序遍历非递归实现
        //在辅助栈里表示左节点
        int left = 1;

        //在辅助栈里表示右节
        int right = 2;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        //辅助栈，用来判断子节点返回父节点时处于左节点还是右节点。
        Stack<Integer> stack2 = new Stack<Integer>();
        while (biTree != null || !stack.empty()) {
            while (biTree != null) {//将节点压入栈1，并在栈2将节点标记为左节点
                stack.push(biTree);
                stack2.push(left);
                biTree = biTree.left;
            }
            //如果是从右子节点返回父节点，则任务完成，将两个栈的栈顶弹出

            while (!stack.empty() && stack2.peek() == right) {
                stack2.pop();
                System.out.println(stack.pop().val);
            }
            //如果是从左子节点返回父节点，则将标记改为右子节点
            if (!stack.empty() && stack2.peek() == left) {
                stack2.pop();
                stack2.push(right);
                biTree = stack.peek().right;
            }
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

        preOrder(root);
        System.out.println();
        midOrder2(root);  //中序遍历内容。
        System.out.println();

        postOrder(root);
    }
}
