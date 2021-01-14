package com.tree.www;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName MaxDepthOfTree2
 * @Author：Mayuan
 * @Date 2020/3/24 16:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的最大的深度2
 **/
public class MaxDepthOfTree2 {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            // 根据层次遍历来确定二叉树的深度。
            level++;
            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.remove();
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return level;
    }

    public static void main(String[] args) {

        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        System.out.println(maxDepth(binTree));

    }
}



