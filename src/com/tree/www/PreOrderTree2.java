package com.tree.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: JavaWorkSpace2->PreOrderTree2
 * @description: 二叉树的先序遍历放进链表
 * @author: MaYuan
 * @create: 2020-01-02 21:27
 * @version: 1.0
 **/

public class PreOrderTree2 {
    public static List<Integer> preOrderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        st.push(root);
        while (!st.empty()) {
            TreeNode node = st.pop();
            list.add(node.val);
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        List<Integer> list2 = preOrderTraversal(binTree);
        for (int i : list2) {
            System.out.print(i + " ");
        }
    }
}
