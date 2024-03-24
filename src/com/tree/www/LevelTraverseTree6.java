package com.tree.www;

import java.util.*;

/**
 * @ClassName LevelTraverseTree6
 * @Author：Mayuan
 * @Date 2020/2/25 15:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的层次的遍历2
 * 第一层，从左到右，第二层从右面到左面
 * 然后依次类推
 **/
public class LevelTraverseTree6 {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        // 构建一个队列。
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        // 首先是从左面到到右面，代表的是true
        boolean isLeft = true;
        if (root == null) {
            return lists;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            isLeft = !isLeft;
            if (isLeft) {
                Collections.reverse(list);
            }
            lists.add(list);
        }
        return lists;
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

        List<List<Integer>> res = levelOrder(n1);

        for (List<Integer> re : res) {
            for (Integer j : re) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
