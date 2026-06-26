package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 求树的每一行的最大值
 *
 * @ClassName MaxLevelValue
 * @Author Mayuan
 * @Date 2026/6/26/星期五 16:52
 * @Version 1.0
 **/
public class MaxLevelValue {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int val = Integer.MIN_VALUE;
            for(int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                val = Math.max(val, node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(val);
        }
        return list;
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

        List<Integer> list = new MaxLevelValue().largestValues(root);
        list.forEach(System.out::println);
    }
}
