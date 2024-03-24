package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Pro1->printTreeLevel3
 * @description: 层次遍历二叉树的节点的内容，取平均值
 * @author: MaYuan
 * @create: 2019-12-22 21:43
 * @version: 1.0
 * * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 输出: [3, 14.5, 11]
 * 解释:
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 **/
public class PrintTreeLevel3 {
    private static ArrayList<Float> levelTree(TreeNode root) {
        ArrayList<Float> list2 = new ArrayList<Float>();
        if (root == null) {
            return list2;
        }
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        queue2.add(root);
        while (!queue2.isEmpty()) {
            float sum2 = 0f;
            // 每一层的大小。
            int count = queue2.size();

            for (int i = 0; i < count; i++) {
                TreeNode temp = queue2.poll();
                sum2 += temp.val;
                if (temp.left != null) {
                    queue2.add(temp.left);
                }
                if (temp.right != null) {
                    queue2.add(temp.right);
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
        ArrayList<Float> list2 = levelTree(binTree);

        for (Float i : list2) {
            System.out.print(i + " ");
        }
    }
}
