package com.tree.www;

import java.util.Arrays;

/**
 * @ClassName NumsToTree
 * @Author：Mayuan
 * @Date 2020/3/30 15:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 通过一个有序的数组来构建一颗二叉树
 **/
public class NumsToTree {


    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0)
            return null;

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return root;
    }

    /**
     * 二叉树的中序遍历是一个有序的数组。
     */

    private static void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            midOrder(root.left);
        }
        System.out.print(root.val + " ");
        if (root.right != null) {
            midOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode temp = sortedArrayToBST(nums);
        midOrder(temp);
    }
}
