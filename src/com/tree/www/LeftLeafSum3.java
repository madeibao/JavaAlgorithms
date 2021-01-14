package com.tree.www;

/**
 * @ClassName LeftLeafSum3
 * @Author：Mayuan
 * @Date 2020/10/12 15:08
 * @Description TODO
 * @Version 1.0
 * <p>
 * 左面的叶子节点的值。
 **/

public class LeftLeafSum3 {

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = 0, right = 0, cur = 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            cur = root.left.val;
        } else {
            left = sumOfLeftLeaves(root.left);
        }
        right = sumOfLeftLeaves(root.right);
        return left + right + cur;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        TreeNode l6 = new TreeNode(6);
        TreeNode l7 = new TreeNode(7);
        TreeNode l8 = new TreeNode(8);
        TreeNode l9 = new TreeNode(9);
        TreeNode ll0 = new TreeNode(10);
        TreeNode ll1 = new TreeNode(11);
        TreeNode ll2 = new TreeNode(12);
        TreeNode ll3 = new TreeNode(13);
        TreeNode ll4 = new TreeNode(14);
        TreeNode ll5 = new TreeNode(15);


        root.left = l2;
        root.right = l3;

        l2.left = l4;
        l2.right = l5;

        l3.left = l6;
        l3.right = l7;

        l4.left = l8;
        l4.right = l9;

        l5.left = ll0;
        l5.right = ll1;

        l6.left = ll2;
        l6.right = ll3;

        l7.left = ll4;
        l7.right = ll5;

        System.out.print(sumOfLeftLeaves(root));

    }
}
