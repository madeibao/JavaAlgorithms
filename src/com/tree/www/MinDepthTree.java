package com.tree.www;

/**
 * @program: JavaWorkSpace2->MinDepthTree
 * @description: 二叉树的最低的深度
 * @author: MaYuan
 * @create: 2020-02-12 11:38
 * @version: 1.0
 **/
public class MinDepthTree {

    private static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        return root.left == null || root.right == null ? m1 + m2 + 1 : Math.min(m1, m2) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        TreeNode rl1 = new TreeNode(15);
        TreeNode rl2 = new TreeNode(7);

        root.left = l1;
        root.right = r1;

        r1.left = rl1;
        r1.right = rl2;
        System.out.println(minDepth(root));
    }
}
