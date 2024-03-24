package com.tree.www;

import java.util.Stack;

/**
 * @ClassName SortedTreeSum
 * @Author：Mayuan
 * @Date 2020/2/18 16:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * <p>
 * 二叉搜索树保证具有唯一的值。
 * 示例 1：
 * <p>
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 * 示例 2：
 * <p>
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 * 求一个二叉树的范围内容的和来进行相加。
 **/
public class SortedTreeSum {
    public static int rangeSumBST(TreeNode root, int L, int R) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (L <= node.val && node.val <= R) {
                    ans += node.val;
                }
                if (L < node.val) {
                    stack.push(node.left);
                }
                if (node.val < R) {
                    stack.push(node.right);
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode l1 = new TreeNode(5);
        TreeNode r1 = new TreeNode(15);
        TreeNode ll2 = new TreeNode(3);
        TreeNode lr2 = new TreeNode(7);
        TreeNode rr2 = new TreeNode(18);

        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        l1.right = lr2;
        r1.right = rr2;

        int left = 7;
        int right = 15;

        System.out.println(rangeSumBST(root, left, right));
    }
}
