package com.tree.www;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName K
 * @Author：Mayuan
 * @Date 2020/6/6 14:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉搜索树的第k个节点。
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，
 * 按结点数值大小顺序第三小结点的值为4。
 **/
public class KthNumberTree2 {
    ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    ArrayList<Integer> num = new ArrayList<Integer>();

    TreeNode KthNode(TreeNode pRoot, int k) {

        if (k < 1) {
            return null;
        }

        load(pRoot);

        if (k > list.size()) {
            return null;
        }

        int[] numbers = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            numbers[i] = num.get(i);
        }
        Arrays.sort(numbers);
        int value = numbers[k - 1];

        for (TreeNode node : list) {
            if (node.val == value) {
                return node;
            }
        }
        return null;
    }

    public void load(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root != null) {
            list.add(root);
            num.add(root.val);
        }
        load(root.left);
        load(root.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;

        int k = 1;

        System.out.println(new KthNumberTree2().KthNode(t1, k).val);


    }

}
