package com.tree.www;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName LevelTraverseTree9
 * @Author：Mayuan
 * @Date 2020/5/30 20:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 层次的遍历二叉树的值
 * 保存在数组中
 **/
public class LevelTraverseTree9 {

    public static int[] levelOrder(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return new int[]{};
        }
        Deque<TreeNode> deque = new LinkedList<TreeNode>();

        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode t = deque.pop();
            list.add(t.val);
            if (t.left != null) {
                deque.add(t.left);
            }
            if (t.right != null) {
                deque.add(t.right);
            }
        }

        int[] res2 = list.stream().mapToInt(Integer::valueOf).toArray();
        return res2;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        root.left = l2;
        root.right = r2;

        int[] res = levelOrder(root);
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
