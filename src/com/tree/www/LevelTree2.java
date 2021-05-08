package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTree2
 * @Author：Mayuan
 * @Date 2020/11/7 8:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的层次遍历。
 **/
public class LevelTree2 {
    public List<List<Integer>> travel(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp2 = queue.poll();
                temp.add(temp2.val);
                if (temp2.left != null) {
                    queue.add(temp2.left);
                }
                if (temp2.right != null) {
                    queue.add(temp2.right);
                }
            }
            res.addFirst(temp);
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

        List<List<Integer>> res = new LevelTree2().travel(head);
        res.forEach(System.out::println);
    }
}
