package com.tree.www;

/**
 *
 * 计算二叉树的坡度
 * @ClassName GetTreebalanceNum
 * @Author Mayuan
 * @Date 2026/7/3/星期五 11:20
 * @Version 1.0
 **/
public class GetTreeBalanceNum {
    int ans;

    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = dfs(root.left), r = dfs(root.right);
        ans += Math.abs(l - r);
        return l + r + root.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);

        root.left = l2;
        root.right = l3;

        System.out.println(new GetTreeBalanceNum().findTilt(root));
    }
}
