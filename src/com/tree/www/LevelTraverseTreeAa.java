package com.tree.www;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTreeAa
 * @Author：Mayuan
 * @Date 2020/12/9/0009 21:10
 * @Description TODO
 * @Version 1.0
 **/
public class LevelTraverseTreeAa {

    private static List<List<Integer>> level(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> que = new ArrayDeque<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                temp.add(node.val);
                if (node.left != null) {
                    que.offer(node.left);
                }
                if (node.right != null) {
                    que.offer(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        root.left = l2;
        root.right = r2;

        List<List<Integer>> res = level(root);
        res.forEach(System.out::println);

    }
}
