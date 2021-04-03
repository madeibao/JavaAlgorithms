package com.shuzu.www;

/**
 * @ClassName RobMoney7
 * @Author：Mayuan
 * @Date 2021/4/2/0002 15:34
 * @Description TODO
 * @Version 1.0
 *
 * 树形的结构来打劫。
 * 采用的是后序遍历，深度后序遍历序列。
 *
 **/
public class RobMoney7 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int v) {
            this.val = v;
        }
    }

    public static int rob(TreeNode root) {
        int[] rootStatus = dfs(root);
        return Math.max(rootStatus[0], rootStatus[1]);
    }

    public static int[] dfs(TreeNode root) {
        if(root == null)  {
            return new int[]{0, 0};
        }

        //0表示选中，1表示未选中
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int selected = root.val + l[1] + r[1];
        int notSelected = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);

        // 返回选择和不选择的内容。
        return new int[]{selected, notSelected};
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(1);

        root.left= l2;
        root.right = l3;

        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(1);

        l2.right= n2;
        l3.right = n3;

        System.out.println(rob(root));
    }
}
