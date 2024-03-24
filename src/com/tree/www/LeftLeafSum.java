package com.tree.www;

/**
 * @program: JavaWorkSpace2->LeftLeafSum
 * @description: 左面的叶子的和
 * @author: MaYuan
 * @create: 2020-02-12 20:42
 * @version: 1.0
 * 求一颗二叉树的左面的叶子节点的内容的和。
 **/
public class LeftLeafSum {

    public static int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if (root == null) {
            return 0;
        }

        if (isLeftLeaves(root.left)) {
            res += root.left.val;
        } else {
            res += sumOfLeftLeaves(root.left);
        }
        res += sumOfLeftLeaves(root.right);
        return res;
    }

    private static boolean isLeftLeaves(TreeNode root) {
        return root != null && root.left == null && root.right == null;
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

        System.out.println(sumOfLeftLeaves(n1));
    }
}
