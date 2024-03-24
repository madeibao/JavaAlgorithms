package com.tree.www;


import java.util.*;

/**
 * @ClassName RightViewTree3
 * @Author：Mayuan
 * @Date 2021/1/9/0009 21:05
 * @Description TODO
 * @Version 1.0
 *
 * 二叉树的右视图。
 *
 *
 **/
public class RightViewTree3 {

    private static List<Integer> rightView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) {
            return list;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for(int i=0;i<n;i++) {
                TreeNode node = queue.poll();
                if(i==n-1) {
                    list.add(node.val);
                }
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
        }

        return list;

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

        List<Integer> list2 = rightView(n1);
        list2.forEach(System.out::println);

    }
}
