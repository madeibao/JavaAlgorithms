package com.tree.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName ConstructTree
 * @Author：Mayuan
 * @Date 2020/2/18 17:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 构建一颗二叉树，判断是否为平衡的二叉树
 * <p>
 * 平衡二叉树的性质为: 要么是一棵空树，要么任何一个节点的左右子树高度差的绝对值不超过 1。给定一棵二叉树，判断这棵二叉树是否为平衡二叉树。
 * 一颗树的高度指的是树的根节点到所有节点的距离中的最大值。
 * <p>
 * 输入描述:
 * 第一行输入两个整数 n 和 root，n 表示二叉树的总节点个数，root 表示二叉树的根节点。
 * 以下 n 行每行三个整数 fa，lch，rch，表示 fa 的左儿子为 lch，右儿子为 rch。(如果 lch 为 0 则表示 fa 没有左儿子，rch同理)
 * 输出描述:
 * 如果是平衡二叉树则输出 "true"，否则输出 "false"。
 * 示例1
 * 输入
 * 复制
 * 3 2
 * 1 2 3
 * 输出
 * 复制
 * true
 **/
public class ConstructTree {

    static class Node {
        int val;
        Node parent;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class ReturnData {
        int height;
        boolean isBST;

        public ReturnData(int height, boolean isBST) {
            this.height = height;
            this.isBST = isBST;
        }
    }

    public static Node createTree(BufferedReader in) throws IOException {
        String[] strings = in.readLine().split(" ");
        int[] nodes = getIntArray(strings);
        Node root = new Node(nodes[0]);
        if (nodes[1] != 0) {
            root.left = createTree(in);
        }
        if (nodes[2] != 0) {
            root.right = createTree(in);
        }
        return root;
    }

    public static int[] getIntArray(String[] strs) {
        int[] res = new int[strs.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.valueOf(strs[i]);
        }
        return res;
    }

    public static ReturnData process(Node head) {
        if (head == null) {
            return new ReturnData(0, true);
        }
        ReturnData leftData = process(head.left);
        ReturnData rightData = process(head.right);
        int height = Math.max(leftData.height, rightData.height) + 1;
        boolean isBST = leftData.isBST && rightData.isBST && Math.abs(leftData.height - rightData.height) < 2;
        return new ReturnData(height, isBST);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        Node root = createTree(bf);
        ReturnData res = process(root);
        System.out.println(res.isBST);
    }

}