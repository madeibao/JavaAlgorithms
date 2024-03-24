package com.tree.www;

/**
 * @ClassName AncestorTreeNode2
 * @Author：Mayuan
 * @Date 2020/12/16/0016 21:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉搜索树的公共祖先。
 **/
public class AncestorTreeNode2 {

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

    public static void main(String[] args) {


    }
}
