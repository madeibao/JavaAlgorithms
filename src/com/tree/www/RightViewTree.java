package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName RightViewTree
 * @Author：Mayuan
 * @Date 2020/10/9 9:47
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的右视图的内容。
 * 从右面来观察一颗二叉树从而获得的值。
 **/
public class RightViewTree {
    public static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        if (root == null) {
            return list2;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

                // 如果 遍历到了最后的一个位置上。添加进去。
                if (i == n - 1) {
                    list2.add(temp.val);
                }
            }
        }
        return list2;
    }

    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(1);
        TreeNode nl2 = new TreeNode(2);
        TreeNode nr2 = new TreeNode(5);
        TreeNode nll3 = new TreeNode(3);
        TreeNode nlr4 = new TreeNode(4);
        TreeNode nrr5 = new TreeNode(6);

        n1.left = nl2;
        n1.right = nr2;

        nl2.left = nll3;
        nl2.right = nlr4;

        nr2.right = nrr5;

        List<Integer> list2 = rightSideView(n1);
        list2.forEach(System.out::println);
    }
}
