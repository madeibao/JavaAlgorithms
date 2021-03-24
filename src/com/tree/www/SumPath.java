package com.tree.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SumPath
 * @Author：Mayuan
 * @Date 2020/3/23 17:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * 返回:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5],
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class SumPath {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(root, sum, ret, new ArrayList<Integer>());
        return ret;
    }

    public void dfs(TreeNode root, int sum, List<List<Integer>> ret, ArrayList<Integer> route) {
        if (root == null) {
            return;
        }
        route.add(root.val);
        int left = sum - root.val;
        if (root.left == null && root.right == null) {
            if (left == 0) {
                ret.add(route);
                return;
            }
            else {
                return;
            }
        }

        dfs(root.left, left, ret, new ArrayList<>(route));
        dfs(root.right, left, ret, new ArrayList<>(route));
        route.remove(route.size() - 1);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        TreeNode l2 = new TreeNode(4);
        TreeNode r2 = new TreeNode(8);
        TreeNode l31 = new TreeNode(11);
        TreeNode l32 = new TreeNode(13);
        TreeNode l33 = new TreeNode(4);
        TreeNode l41 = new TreeNode(7);
        TreeNode l42 = new TreeNode(2);
        TreeNode l43 = new TreeNode(5);
        TreeNode l44 = new TreeNode(1);

        root.left = l2;
        root.right = r2;

        l2.left = l31;

        r2.left = l32;
        r2.right = l33;

        l31.left = l41;
        l31.right = l42;
        l33.left = l43;
        l33.right = l44;

        List<List<Integer>> res = new SumPath().pathSum(root, 22);
        for (List<Integer> re : res) {
            for (Integer i : re) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
