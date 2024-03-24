package com.tree.www;

import java.util.Stack;

/**
 * @ClassName KthNumberTree
 * @Author：Mayuan
 * @Date 2020/2/22 21:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一颗二叉的搜索树中，第K大的元素。
 **/
public class KthNumberTree {
    static Stack<Integer> out = new Stack<Integer>();

    public static void mid(TreeNode root) {
        if (root != null) {
            mid(root.left);
            out.add(root.val);
            mid(root.right);
        }
    }

    public static int kthLargest(TreeNode root, int k) {

        // 调用中序遍历，然后用栈来进行存储起来。
        mid(root);
        int ans = 0;
        while (k > 0) {
            ans = out.pop();
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;

        int k = 1;

        System.out.println(kthLargest(t1, k));
    }
}
