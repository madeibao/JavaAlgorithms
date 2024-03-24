package com.tree.www;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTreeH
 * @Author：Mayuan
 * @Date 2021/4/25/0025 9:29
 * @Description TODO
 * @Version 1.0
 *
 * 二叉树的遍历。

 hashCode
 equals方法
 getClass
 toString
 notify
 notifyAll方法
 wait方法
 clone方法


 **/
public class LevelTraverseTreeH {

    static List<ArrayList<Integer>> level(TreeNode root) {
        List<ArrayList<Integer>> res =new ArrayList<>();
        if(root==null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        // 链表只要不为空的链表。
        while (!queue.isEmpty()) {
            ArrayList<Integer> list2 =new ArrayList<>();
            TreeNode node =queue.poll();
            list2.add(node.val);
            if(node.left!=null) {
                queue.offer(node.left);
            }
            if(node.right!=null) {
                queue.offer(node.right);
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

        List<ArrayList<Integer>> res = level(root);
        res.forEach(System.out::println);
    }
}
