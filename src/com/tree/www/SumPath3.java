package com.tree.www;

/**
 * @ClassName SumPath3
 * @Author：Mayuan
 * @Date 2020/5/23 21:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的路径和。
 **/
public class SumPath3 {

    public static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return helper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private static int helper(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        int res = 0;
        if (root.val == sum) {
            res += 1;
        }

        res += helper(root.left, sum - root.val);
        res += helper(root.right, sum - root.val);
        return res;
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(10);
        TreeNode l2 = new TreeNode(5);
        TreeNode r2 = new TreeNode(-3);
        TreeNode l31 = new TreeNode(3);
        TreeNode l32 = new TreeNode(2);
        TreeNode l33 = new TreeNode(11);
        TreeNode l41 = new TreeNode(3);
        TreeNode l42 = new TreeNode(-2);
        TreeNode l43 = new TreeNode(1);

        head.left = l2;
        head.right = r2;

        l2.left = l31;
        l2.right = l32;

        r2.right = l33;

        l31.left = l41;
        l31.right = l42;

        l32.right = l43;

        System.out.println(pathSum(head, 8));
    }
}
