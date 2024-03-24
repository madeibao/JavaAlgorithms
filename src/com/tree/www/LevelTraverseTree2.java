package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTree2
 * @Author：Mayuan
 * @Date 2020/2/18 14:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的层次遍历2.
 **/
public class LevelTraverseTree2 {
    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list2 = new ArrayList<>();
            int size = queue.size();
            while (size-- > 0) {
                TreeNode root1 = queue.poll();
                list2.add(root1.val);
                if (root1.left != null) {
                    queue.add(root1.left);
                }
                if (root1.right != null) {
                    queue.add(root1.right);
                }
            }
            res.add(list2);
        }
        return res;
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
        for (List<Integer> temp : res) {
            for (Integer j : temp) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}





