package com.tree.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LevelTraverseTree5
 * @Author：Mayuan
 * @Date 2020/2/25 14:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的层次遍历
 * 从左到右面，然后从右面到左面
 **/
public class LevelTraverseTree5 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, res, 0);
        return res;
    }

    private void traversal(TreeNode root, List<List<Integer>> res, int level) {
        if (root == null) {
            return;
        }

        if (res.size() == level) {
            res.add(new ArrayList<>());
        }

        // 如果是奇数层，从右面到左面，逐渐的插入第一个位置。
        if ((level & 1) == 1) {
            res.get(level).add(0, root.val);
        } else {
            res.get(level).add(root.val);
        }

        traversal(root.left, res, level + 1);
        traversal(root.right, res, level + 1);
    }

    public static void main(String[] args) {

        LevelTraverseTree4 th2 = new LevelTraverseTree4();

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

        List<List<Integer>> res = th2.zigzagLevelOrder(n1);

        /**
         for(List<Integer> re:res) {
         for(Integer j:re) {
         System.out.print(j+" ");
         }
         System.out.println();
         }
         */


        res.forEach(System.out::println);
    }
}
