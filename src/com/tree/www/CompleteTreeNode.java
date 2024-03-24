package com.tree.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName CompleteTreeNode
 * @Author：Mayuan
 * @Date 2020/6/16 21:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为完全二叉树的内容。
 **/
public class CompleteTreeNode {

    public static boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while (q.peek() != null) {
            TreeNode node = q.poll();
            q.offer(node.left);
            q.offer(node.right);
        }

        while (!q.isEmpty() && q.peek() == null) {
            q.poll();
        }
        return q.isEmpty();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);

        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);

        root.left = l2;
        root.right = l3;

        l2.left = l4;
        l2.right = l5;
        System.out.println(isCompleteTree(root));


    }
}
