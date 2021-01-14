package com.tree.www;

/**
 * @ClassName LengthOfTree
 * @Author：Mayuan
 * @Date 2020/6/22 22:12
 * @Description TODO
 * @Version 1.0
 **/
public class LengthOfTree {
    public static int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        diameterOfBinaryTree(root, max);
        return max[0];
    }

    public static int diameterOfBinaryTree(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }
        int left = diameterOfBinaryTree(root.left, max);
        int right = diameterOfBinaryTree(root.right, max);
        max[0] = Math.max(left + right, max[0]);
        return Math.max(left, right) + 1;
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

        System.out.println(diameterOfBinaryTree(n1));

    }
}
