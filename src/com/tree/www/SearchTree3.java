package com.tree.www;

import java.util.Stack;

/**
 * @ClassName SearchTree3
 * @Author：Mayuan
 * @Date 2020/11/4 17:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉搜索树的第 k 大的数据；
 **/
public class SearchTree3 {

    Stack<Integer> stack = new Stack<>();

    public void add(TreeNode root) {
        if (root != null) {
            add(root.left);
            stack.add(root.val);
            add(root.right);
        }
    }

    public int KthLargestNum(TreeNode root, int k) {

        // 首先调用二叉树来生成栈中的内容。
        // 中序遍历是一个有序的结构。
        add(root);
        int res = 0;
        while (k-- > 0) {
            res = stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(1);
        TreeNode r3 = new TreeNode(3);

        r1.left = r2;
        r1.right = r3;

        System.out.println(new SearchTree3().KthLargestNum(r1, 2));
    }
}
