package com.tree.www;

/**
 * @program: JavaWorkSpace2->MinDepthOfTree
 * @description: 二叉树的最小的高度
 * @author: MaYuan
 * @create: 2020-02-07 16:33
 * @version: 1.0
 * <p>
 * 给定一个二叉树，找出其最小深度。
 * <p>
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最小深度  2.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 二叉树的最小的深度。
 **/

public class MinDepthOfTree {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        }

        if (root.right == null) {
            return minDepth(root.left) + 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        // 递归的判断最小的深度值，取最小值。
        return (left > right) ? (right + 1) : (left + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        TreeNode rl1 = new TreeNode(15);
        TreeNode rl2 = new TreeNode(7);

        root.left = l1;
        root.right = r1;

        r1.left = rl1;
        r1.right = rl2;
        System.out.println(minDepth(root));
    }
}
