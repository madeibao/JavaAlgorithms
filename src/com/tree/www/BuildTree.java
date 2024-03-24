package com.tree.www;

import java.util.Arrays;

/**
 * @ClassName BuildTree
 * @Author：Mayuan
 * @Date 2021/6/3/0003 21:41
 * @Description TODO
 * @Version 1.0
 * 利用前序和中序来搭建二叉树
 **/

public class BuildTree {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            return new TreeNode(preorder[0]);
        }
        // 确定根节点
        // 先序遍历第一个节点就是根节点。
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (inorder[i] == preorder[0]) {
                //在中序列表里查找根元素下标
                index = i;
            }
        }
        //取出左子树的前序遍历
        int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, index + 1);
        //取出左子树的中序遍历
        int[] leftInOrder = Arrays.copyOfRange(inorder, 0, index);
        //生成左子树
        root.left = buildTree(leftPreOrder, leftInOrder);

        //取出右子树的前序遍历列表
        int[] rightPreOrder = Arrays.copyOfRange(preorder, index + 1, length);
        //取出右子树的中序遍历列表
        int[] rightInOrder = Arrays.copyOfRange(inorder, index + 1, length);
        //生成右子树
        root.right = buildTree(rightPreOrder, rightInOrder);
        return root;
    }

    static void preOrder(TreeNode root) {
        if(root==null) {
            return;
        }

        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode res = buildTree(preorder,inorder);
        preOrder(res);
    }
}
