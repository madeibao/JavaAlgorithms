package com.tree.www;


import java.util.*;

/**
 * @ClassName LevelTraverseTreeC
 * @Author：Mayuan
 * @Date 2020/12/14/0014 20:25
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的遍历。
 **/
public class LevelTraverseTreeC {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        // 重要的改变时设置一个链表的值，并且链表为可以添加头部或者是尾部。
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.add(root.left);
                }
                if (node.right != null) {
                    queue.add(root.right);
                }
            }

            // 采用头插法来确定二叉树的层次结构。
            res.addFirst(temp);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        root.left = l2;
        root.right = r2;

        List<List<Integer>> res = levelOrderBottom(root);
        res.forEach(System.out::println);

    }
}
