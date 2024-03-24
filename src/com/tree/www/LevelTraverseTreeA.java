package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTreeA
 * @Author：Mayuan
 * @Date 2020/10/12 14:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 二叉树额层次的遍历内容。
 **/
public class LevelTraverseTreeA {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list2 = new ArrayList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue2.add(root);
        while (!queue2.isEmpty()) {

            List<Integer> temp = new ArrayList<>();
            int len = queue2.size();
            for (int i = 0; i < len; i++) {
                TreeNode r2 = queue2.poll();
                temp.add(r2.val);
                if (r2.left != null) {
                    queue2.add(r2.left);
                }
                if (r2.right != null) {
                    queue2.add(r2.right);
                }
            }
            list2.add(temp);
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

        List<List<Integer>> res = levelOrder(n1);

        for (List<Integer> re : res) {
            for (Integer j : re) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
