package com.tree.www;

/**
 * @program: JavaWorkSpace2->LeftLeafSum2
 * @description: 左面的节点的和2
 * @author: MaYuan
 * @create: 2020-02-12 21:04
 * @version: 1.0
 **/
public class LeftLeafSum2 {

    public static int sumOfLeftLeaves(TreeNode root) {
        // 如果root为空的条件下，直接的返回0的结果值。
        if (root == null) {
            return 0;
        }
        //left存root的左子树的左叶子之和,right存右子树的左叶子之和
        //若root.left为左叶子,cur存root.left的值
        int left = 0, right = 0, cur = 0;
        //若root.left为左叶子
        if (root.left != null && root.left.left == null && root.left.right == null) {
            //存下这片左叶子的值
            cur = root.left.val;
        } else {
            //否则继续递归
            // 左子树值。
            left = sumOfLeftLeaves(root.left);
        }
        // 右子树值
        right = sumOfLeftLeaves(root.right);
        //返回左子树值(若root.left非左叶子)+右子树值+root.left值(若root.left为左叶子)
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
