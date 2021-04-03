package com.tree.www;

/**
 * @ClassName BalanceTree
 * @Author：Mayuan
 * @Date 2021/3/27/0027 20:16
 * @Description TODO
 * @Version 1.0
 *
 * 平衡二叉树结构。
 *
 **/
public class BalanceTree {

    public  boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) {
            return true;
        }

        if (root.left == null && root.right == null)  {
            return true;
        }

        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }

    private  int getHeight(TreeNode root) {
        if(root==null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
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
