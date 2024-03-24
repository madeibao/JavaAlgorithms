package com.tree.www;

/**
 * @ClassName SumTreeNode
 * @Author：Mayuan
 * @Date 2020/10/8 19:06
 * @Description TODO
 * @Version 1.0
 **/
public class SumTreeNode {
    public static int sumNumbers(TreeNode root) {
        return DFS(root, 0);
    }

    private static int DFS(TreeNode root, int i) {
        //1、节点为空
        if (root == null) {
            return 0;
        }
        int res = i * 10 + root.val;
        //2、节点为叶子节点
        if (root.left == null && root.right == null) {
            return res;
        }
        //3、节点为非叶子节点
        return DFS(root.left, res) + DFS(root.right, res);
    }


    public static void main(String[] args) {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n2.left = n3;
        n2.right = n4;

        System.out.println(sumNumbers(n2));
    }

}