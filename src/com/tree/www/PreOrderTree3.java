package com.tree.www;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName PreOrderTree3
 * @Author：Mayuan
 * @Date 2020/3/9 23:00
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的先序遍历
 * 二叉树的先序遍历的形式，通过一个链表来进行存储。
 **/
public class PreOrderTree3 {
    public static List<Integer> preorderTraversal(TreeNode root) {
        //非递归前序遍历，需要借助栈
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        //当树为空树时，直接返回一个空list
        if (root == null) {
            return list;
        }

        //第一步是将根节点压入栈中
        stack.push(root);
        //当栈不为空时，出栈的元素插入list尾部。
        //当它的孩子不为空时，将孩子压入栈，一定是先压右孩子再压左孩子
        while (!stack.isEmpty()) {
            //此处的root只是一个变量的复用
            root = stack.pop();
            list.add(root.val);

            // 先压入右子树，然后压入左子树。
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(14);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(15);
        binTree.left = left1;
        binTree.right = right;

        List<Integer> list2 = preorderTraversal(binTree);
        list2.forEach(System.out::println);
    }
}
