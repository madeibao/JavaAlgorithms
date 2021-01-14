package com.tree.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LevelTraverseTree3
 * @Author：Mayuan
 * @Date 2020/2/25 14:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的层次遍历来实现
 * 之子形来打印这个二叉树。
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
 * 第三行再按照从左到右的顺序打印，其他行以此类推。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class LevelTraverseTree3 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        addLevel2List(0, root);
        return res;
    }

    private void addLevel2List(int depth, TreeNode node) {
        if (node == null) {
            return;
        }
        if (res.size() <= depth) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            res.add(list);
        } else {
            if (depth % 2 == 0) {
                res.get(depth).add(node.val);
            } else {
                res.get(depth).add(0, node.val);
            }
        }
        addLevel2List(depth + 1, node.left);
        addLevel2List(depth + 1, node.right);
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

        LevelTraverseTree3 th = new LevelTraverseTree3();
        List<List<Integer>> res = th.levelOrder(n1);

        for (List<Integer> re : res) {
            for (Integer j : re) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
