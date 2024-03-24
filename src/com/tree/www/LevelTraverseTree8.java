package com.tree.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelTraverseTree8
 * @Author：Mayuan
 * @Date 2020/4/26 17:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从底部到上部来遍历一个二叉树
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class LevelTraverseTree8 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<>();
            // 每次都取出一层的所有数据
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                oneLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            // 每次都往队头塞
            result.addFirst(oneLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        TreeNode nl2 = new TreeNode(9);
        TreeNode nr2 = new TreeNode(20);
        TreeNode nl3 = new TreeNode(15);
        TreeNode nr3 = new TreeNode(7);

        head.left = nl2;
        head.right = nr2;

        nr2.left = nl3;
        nl2.right = nr3;

        List<List<Integer>> res = new LevelTraverseTree8().levelOrderBottom(head);
        for (List<Integer> re : res) {
            for (Integer temp : re) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
