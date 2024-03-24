package com.tree.www;

/**
 * @ClassName SumTreeNode2
 * @Author：Mayuan
 * @Date 2021/4/29/0029 22:04
 * @Description TODO
 * @Version 1.0
 *
 * 二叉树节点的求和。
 *
 **/
public class SumTreeNode2 {

    private static int sum(TreeNode root) {
        return helper(root,0);
    }

    private static int helper(TreeNode root, int k) {
        if(root==null) {
            return 0;
        }

        int res = k*10+root.val;
        if(root.right==null&&root.left==null) {
            return res;
        }

        return helper(root.left, res)+helper(root.right,res);
    }

    public static void main(String[] args) {

        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n2.left = n3;
        n2.right = n4;
        System.out.println(sum(n2));

    }
}



