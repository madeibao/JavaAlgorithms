package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: JavaWorkSpace2->AverageLevelNum
 * @description: 一个二叉树的每一层的平均值的内容
 * @author: MaYuan
 * @create: 2020-02-04 22:20
 * @version: 1.0
 **/

public class AverageLevelNum {
    public static List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list2 = new ArrayList<Double>();
        // 用链表来作为队列的形式，存储起来。
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return list2;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            // 返回队列的大小。
            int count = queue.size();
            double sum2 = 0;
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                sum2 += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list2.add(sum2 / count);
        }
        return list2;
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        List<Double> list2 = averageOfLevels(binTree);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
