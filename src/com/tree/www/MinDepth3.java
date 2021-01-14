package com.tree.www;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Mindepth3
 * @Author：Mayuan
 * @Date 2020/6/7 20:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一颗二叉树的最小的深度。
 **/
public class MinDepth3 {

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int depth = 1;
        for (; !q.isEmpty(); depth++) {
            for (int sz = q.size(); sz > 0; sz--) {
                TreeNode node = q.poll();

                if (isLeaf(node)) return depth;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        return depth;
    }

    /**
     * BFS迭代实现二叉树最大深度
     * 时间复杂度O(n)
     * 空间复杂度:线性表最差O(n)、二叉树完全平衡最好O(logn)
     *
     * @param root 根节点
     * @return 最大深度
     */
    private static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //BFS的层次遍历思想，记录二叉树的层数，
        //遍历完，层数即为最大深度
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            maxDepth++;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.pollFirst();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return maxDepth;
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        TreeNode rl1 = new TreeNode(15);
        TreeNode rl2 = new TreeNode(7);

        root.left = l1;
        root.right = r1;

        r1.left = rl1;
        r1.right = rl2;
        System.out.println(minDepth(root));
    }
}
