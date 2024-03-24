package com.tree.www;

/**
 * @ClassName SumPath2
 * @Author：Mayuan
 * @Date 2020/5/15 18:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 路径的总和的个数。
 **/
public class SumPath2 {
    public static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int result = countPath(root, sum);
        int a = pathSum(root.left, sum);
        int b = pathSum(root.right, sum);
        return result + a + b;

    }

    public static int countPath(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum - root.val;
        int result = sum == 0 ? 1 : 0;
        return result + countPath(root.left, sum) + countPath(root.right, sum);
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
