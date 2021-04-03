package com.tree.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName preOrderTree4
 * @Author：Mayuan
 * @Date 2020/9/24 16:07
 * @Description TODO
 * @Version 1.0
 *
 * 二叉树的先序遍历。
 **/
public class PreOrderTree4 {

    public List<Integer> preorderTraversal(TreeNode root) {

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
        PreOrderTree4 pre = new PreOrderTree4();
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        List<Integer> list2 = pre.preorderTraversal(binTree);
        for (int i : list2) {
            System.out.print(i + " ");
        }
    }
}
