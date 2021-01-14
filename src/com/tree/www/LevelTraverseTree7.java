package com.tree.www;

import java.util.*;

/**
 * @ClassName LevelTraverseTree7
 * @Author：Mayuan
 * @Date 2020/4/5 10:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从左面到右面和从右面到左面的内容来进行遍历
 **/
public class LevelTraverseTree7 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if (res.size() % 2 == 1) {
                Collections.reverse(tmp);
            }
            res.add(tmp);
        }
        return res;
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

        List<List<Integer>> res = levelOrder(n1);

        for (List<Integer> re : res) {
            for (Integer j : re) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
