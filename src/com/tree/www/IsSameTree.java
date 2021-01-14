package com.tree.www;

/**
 * @program: JavaWorkSpace2->IsSameTree
 * @description: 判断是否为相同的树
 * @author: MaYuan
 * @create: 2020-01-01 21:26
 * @version: 1.0
 * <p>
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 示例 1:
 * 输入:       1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入:      1          1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * 输出: false
 * 示例 3:
 * 输入:       1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * 输出: false
 **/

public class IsSameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(14);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        TreeNode binTree2 = new TreeNode(15);
        TreeNode left2 = new TreeNode(14);
        TreeNode right2 = new TreeNode(14);
        binTree2.left = left2;
        binTree2.right = right2;

        System.out.println(isSameTree(binTree, binTree2));
    }
}
