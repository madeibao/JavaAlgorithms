package com.tree.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName InorderTreeNode
 * @Author：Mayuan
 * @Date 2020/6/18 21:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的中序遍历。
 **/
public class InorderTreeNode {

    public static List<Integer> inorderTraversal(TreeNode root) {
        //用链表节点来存储着所有的值。
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
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
        TreeNode r2 = new TreeNode(2);

        TreeNode r33 = new TreeNode(3);

        root.right = r2;
        r2.left = r33;

        List<Integer> res = inorderTraversal(root);
        res.forEach(System.out::println);
    }
}
