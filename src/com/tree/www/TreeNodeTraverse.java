package com.tree.www;

import java.util.Stack;

/**
 * @ClassName TreeNodeTraverse
 * @Author：Mayuan
 * @Date 2020/2/21 11:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的各种遍历的实现。
 **/
public class TreeNodeTraverse {

    /**
     * 先序遍历
     *
     * @param args
     */
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

    private static void preOrder2(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                root = root.right;
            }
        }
    }

    /**
     * 中序遍历
     *
     * @param root
     */

    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrder(root.left);
        }
        System.out.println(root.val);
        if (root.right != null) {
            inOrder(root.right);
        }
    }

    private static void inOrder2(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {

            while (!stack.isEmpty()) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                System.out.println(root.val);
                root = root.right;
            }
        }
    }

    /**
     * 后序遍历内容
     *
     * @param root
     */

    private static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.println(root.val);
    }

    private static void postOrder2(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            boolean tag = true;
            //前驱节点。
            TreeNode preNode = null;
            while (!stack.isEmpty() && tag == true) {
                treeNode = stack.peek();
                // 之前访问的为空节点或是栈顶节点的右子节点
                if (treeNode.right == preNode) {
                    treeNode = stack.pop();
                    System.out.println(treeNode.val);
                    if (stack.isEmpty()) {
                        return;
                    } else {
                        preNode = treeNode;
                    }
                } else {
                    treeNode = treeNode.right;
                    tag = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(14);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(15);
        binTree.left = left1;
        binTree.right = right;


        postOrder(binTree);

    }
}



