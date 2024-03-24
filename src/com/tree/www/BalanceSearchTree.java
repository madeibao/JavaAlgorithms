package com.tree.www;

/**
 * @ClassName BalanceSearchTree
 * @Author：Mayuan
 * @Date 2020/11/2 19:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为二叉查找树的结果。
 **/
public class BalanceSearchTree {

    public static boolean checkBST(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.left.val > root.val) {
                return false;
            }
            if (root.left.right != null && root.left.right.val > root.val) {
                return false;
            }
        }
        if (root.right != null && root.right.val < root.val) {
            return false;
        }
        return checkBST(root.left) && checkBST(root.right);
    }


    public static void main(String[] args) {


    }
}
