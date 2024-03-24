package com.tree.www;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @ClassName LevelTree
 * @Author：Mayuan
 * @Date 2021/4/11/0011 21:59
 * @Description TODO
 * @Version 1.0
 *
 * 二叉树的遍历操作
 *
 **/
public class LevelTree {

    static ArrayList<ArrayList<Integer>> level(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null) {
            return res;
        }
        // 构建一个双端队列
//        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);
        while (!queue.isEmpty()) {

            int n = queue.size();
            ArrayList<Integer> list2 = new ArrayList<>();
            for(int i=0;i<n;i++) {
                TreeNode temp = queue.poll();
                list2.add(temp.val);
                if(temp.left!=null) {
                    queue.offer(temp.left);
                }
                if(temp.right!=null) {
                    queue.offer(temp.right);
                }
            }
            res.add(list2);
        }

        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        root.left = l2;
        root.right = r2;

        ArrayList<ArrayList<Integer>> res = level(root);
        res.forEach(System.out::println);
    }
}
