package com.tree.www;

/**
 * @ClassName AncestorTreeNode
 * @Author：Mayuan
 * @Date 2020/12/16/0016 21:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的公共祖先节点。
 * 这里的二叉树就是普通的二叉树值。
 **/
public class AncestorTreeNode {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode == null) {
            return rightNode;
        }
        if (rightNode == null) {
            return leftNode;
        }
        return root;
    }

    public static void main(String[] args) {


    }
}
