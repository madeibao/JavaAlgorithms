package com.tree.www;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName PostOrderTree
 * @Author：Mayuan
 * @Date 2020/2/25 10:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的后序遍历，然后用链表来存储
 **/
public class PostOrderTree {
    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
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

        List<Integer> list2 = postorderTraversal(n1);
        list2.forEach(System.out::println);
    }
}



