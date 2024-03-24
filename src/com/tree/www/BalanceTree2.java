package com.tree.www;

/**
 * @ClassName BalanceTree2
 * @Author：Mayuan
 * @Date 2021/6/4/0004 15:34
 * @Description TODO
 * @Version 1.0
 *
 * 判断是否炜平衡二叉树
 *
 **/
public class BalanceTree2 {

    static boolean isBalance(TreeNode root) {
        if(root==null) {
            return true;
        }

        int left=0,right=0;
        if(root.left!=null) {
            left = getDepth(root.left);
        }
        if(root.right!=null) {
            right = getDepth(root.right);
        }

        if(Math.abs(left-right)<=1) {
            return true;
        }

        return isBalance(root.left)&&isBalance(root.right);
    }

    static int getDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }
        if(root.left==null&&root.right==null) {
            return 1;
        }

        return Math.max(getDepth(root.left), getDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);

        root.left= r2;
        root.right= r3;

        System.out.println(new BalanceTree().IsBalanced_Solution(root));


    }
}
