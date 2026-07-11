package com.tree.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  二叉树的最左面的节点的之
 *
 * @ClassName LeftTreeNodeVal
 * @Author Mayuan
 * @Date 2026/7/11/星期六 18:48
 * @Version 1.0
 **/
public class LeftTreeNodeVal {
    public int getLeftNodeVal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (i == 0) {
                    ans = node.val;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        System.out.println(new LeftTreeNodeVal().getLeftNodeVal(n1));
    }
}
