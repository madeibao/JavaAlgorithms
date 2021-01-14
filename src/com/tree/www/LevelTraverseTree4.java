package com.tree.www;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTree4
 * @Author：Mayuan
 * @Date 2020/2/25 14:25
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的特殊的遍历，从左到右，然后从右面到左面
 **/
public class LevelTraverseTree4 {

    List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                insert(node, level);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            level++;
        }
        return ans;
    }
    // 省略两种层级遍历的代码片段

    private void insert(TreeNode node, int level) {
        List<Integer> list = level >= ans.size() ? null : ans.get(level);
        if (list == null) {
            list = new LinkedList<>();
            list.add(node.val);
            ans.add(list);
        } else {
            boolean isOdd = (level & 1) == 1;
            list.add(isOdd ? 0 : list.size(), node.val);
        }
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

        LevelTraverseTree4 th = new LevelTraverseTree4();

        List<List<Integer>> res = th.zigzagLevelOrder(n1);

        for (List<Integer> re : res) {
            for (Integer j : re) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
