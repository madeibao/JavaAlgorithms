package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTreeB
 * @Author：Mayuan
 * @Date 2020/11/18 21:05
 * @Description TODO
 * @Version 1.0
 **/
public class LevelTraverseTreeB {

    private static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list2 = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                list2.add(temp.val);
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            res.add(list2);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        TreeNode nl2 = new TreeNode(9);
        TreeNode nr2 = new TreeNode(20);
        TreeNode nl3 = new TreeNode(15);
        TreeNode nr3 = new TreeNode(7);

        head.left = nl2;
        head.right = nr2;

        nr2.left = nl3;
        nl2.right = nr3;

        List<List<Integer>> res = traverse(head);
        for (List<Integer> re : res) {
            for (Integer temp : re) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
