package com.tree.www;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: JavaWorkSpace2->LevelTraverseTree
 * @description: 二叉树的层次的遍历算法
 * @author: MaYuan
 * @create: 2020-01-11 20:44
 * @version: 1.0
 **/
public class LevelTraverseTree {
    public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
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
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        root.left = l2;
        root.right = r2;
        ArrayList<Integer> list2 = printFromTopToBottom(root);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
