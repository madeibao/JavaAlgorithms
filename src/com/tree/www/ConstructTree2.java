package com.tree.www;

/**
 * @ClassName ConstructTree2
 * @Author：Mayuan
 * @Date 2020/2/21 20:53
 * @Description TODO
 * @Version 1.0
 * 构造一个二叉树的内容。
 * 通过一个数组内容来构建一颗搜索二叉树。
 **/
public class ConstructTree2 {

    public static TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) {
            return null;
        }
        TreeNode temp = construct(preorder, 0, preorder.length - 1);
        return temp;
    }

    private static TreeNode construct(int[] preorder, int s, int e) {
        if (s > e) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[s]);
        int j = s + 1;
        for (; j <= e; j++) {
            if (preorder[j] > preorder[s]) {
                break;
            }
        }
        root.left = construct(preorder, s + 1, j - 1);
        root.right = construct(preorder, j, e);
        return root;
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 5, 1, 7, 10, 12};
        TreeNode temp = bstFromPreorder(nums);
        preOrder(temp);
    }
}
