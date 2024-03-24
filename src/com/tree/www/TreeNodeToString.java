package com.tree.www;

/**
 * @ClassName TreeNodeToString
 * @Author：Mayuan
 * @Date 2020/3/22 17:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的节点变成字符串的形式来进行存储
 **/
public class TreeNodeToString {


    public static String tree2str(TreeNode t) {

        if (t == null) {
            return "";
        }

        String l = tree2str(t.left);
        String r = tree2str(t.right);

        if (l == "" && r == "") {
            return t.val + "";
        } else if (l == "" && r != "") {
            return t.val + "()" + "(" + r + ")";
        } else if (l != "" && r == "") {
            return t.val + "(" + l + ")";
        } else {
            return t.val + "(" + l + ")" + "(" + r + ")";
        }
    }

    public static void main(String[] args) {
        TreeNode root2 = new TreeNode(1);
        TreeNode newf2 = new TreeNode(3);
        TreeNode newr2 = new TreeNode(2);
        TreeNode newf3 = new TreeNode(5);

        root2.left = newf2;
        root2.right = newr2;
        newf2.left = newf3;

        TreeNode root3 = new TreeNode(2);
        TreeNode leafl2 = new TreeNode(1);
        TreeNode leafr2 = new TreeNode(3);
        TreeNode leafl3 = new TreeNode(2);
        TreeNode leafr3 = new TreeNode(2);

        root3.left = leafl2;
        root3.right = leafr2;

        leafl2.right = leafl3;
        leafr2.right = leafr3;

        System.out.println(tree2str(root2));

    }
}
