package com.shuzu.www;

/**
 * @ClassName RobMoney6
 * @Author：Mayuan
 * @Date 2021/4/1/0001 16:24
 * @Description TODO
 * @Version 1.0
 *
 * 打家劫舍
 * 树形的结构。




TreeNode root = new TreeNode(3);
TreeNode l2 = new TreeNode(2);
TreeNode l3 = new TreeNode(1);

root.left= l2;
root.right = l3;

TreeNode n2 = new TreeNode(3);
TreeNode n3 = new TreeNode(1);

l2.right= n2;
l3.right = n3;

System.out.println(rob(root));
 **/
public class RobMoney6 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int v) {
            this.val = v;
        }
    }
    public static int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int money = root.val;
        if (root.left != null) {
            money += (rob(root.left.left) + rob(root.left.right));
        }

        if (root.right != null) {
            money += (rob(root.right.left) + rob(root.right.right));
        }

        return Math.max(money, rob(root.left) + rob(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(1);

        root.left= l2;
        root.right = l3;

        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(1);

        l2.right= n2;
        l3.right = n3;

        System.out.println(rob(root));
    }
}
