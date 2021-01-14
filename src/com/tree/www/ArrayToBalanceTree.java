package com.tree.www;

/**
 * @program: Pro1->ArrayToBalanceTree
 * @description: 有序数组变成一棵平衡树
 * @author: MaYuan
 * @create: 2019-12-23 20:10
 * @version: 1.0
 * *  将一个有序的数组转化为平衡二叉树的内容。
 * *  变成一个平衡的二叉搜索树的内容。
 **/
public class ArrayToBalanceTree {

    /**
     * 调用函数的内容
     *
     * @param args
     */
    private static TreeNode sortedArrayToBst(int[] num) {
        return toBst(num, 0, num.length - 1);
    }

    private static TreeNode toBst(int[] num, int begin, int end) {
        if (num == null || num.length == 0 || end < begin) {
            return null;
        }
        // 这种是只有一个节点的条件下。
        if (begin == end) {
            return new TreeNode(num[begin]);
        }
        int mid = (begin + end) / 2;
        // 代表的是根节点的值。
        int rootVal = num[mid];
        TreeNode res = new TreeNode(rootVal);
        res.left = toBst(num, begin, mid - 1);
        res.right = toBst(num, mid + 1, end);
        return res;
    }

    /**
     * 中序遍历这颗二叉树的内容。
     * 二叉搜索树的内容，得到的是一个有序的序列。
     */
    private static void midOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            midOrder(root.left);
            System.out.print(root.val + " ");
            midOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        // 生成这棵树的内容。
        TreeNode rootNode = sortedArrayToBst(nums);
        midOrder(rootNode);
    }
}
