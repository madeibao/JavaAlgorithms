package com.tree.www;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName MaxDepthOfTree3
 * @Author：Mayuan
 * @Date 2021/1/6/0006 21:47
 * @Description TODO
 * @Version 1.0
 *
 * 二叉树的高度。
 **/
public class MaxDepthOfTree3 {

    public static int maxDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            level++;
            for(int i=0;i<n;i++) {
                TreeNode node = queue.poll();
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
        }
        return level;
    }


    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        System.out.println(maxDepth(binTree));



    }
}
