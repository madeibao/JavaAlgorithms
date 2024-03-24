package com.tree.www;

import java.util.Arrays;

/**
 * @ClassName MinTreeNode
 * @Author：Mayuan
 * @Date 2020/2/18 15:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 创造一个最小的二叉树的内容。
 **/
public class MinTreeNode {

    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));

        return root;
    }

    private static void preOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);
        preOrder(root);
    }
}
