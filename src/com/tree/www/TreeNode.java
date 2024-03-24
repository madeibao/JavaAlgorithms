package com.tree.www;

/**
 * @program: Pro1->TreeNode
 * @description: 构造基本的二叉树的节点内容
 * @author: MaYuan
 * @create: 2019-12-22 21:41
 * @version: 1.0
 * <p>
 * 二叉树的基本的构造节点

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




 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(14);
        TreeNode left1 = new TreeNode(13);
        TreeNode right = new TreeNode(15);
        binTree.left = left1;
        binTree.right = right;

        //构造一棵二叉树的内容。
//																1
//												2							     3
//									4					5		       6 						7
//							8		    	9	  10		  11   12         13      	14           15


        TreeNode root = new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);
        TreeNode l6 = new TreeNode(6);
        TreeNode l7 = new TreeNode(7);
        TreeNode l8 = new TreeNode(8);
        TreeNode l9 = new TreeNode(9);
        TreeNode ll0 = new TreeNode(10);
        TreeNode ll1 = new TreeNode(11);
        TreeNode ll2 = new TreeNode(12);
        TreeNode ll3 = new TreeNode(13);
        TreeNode ll4 = new TreeNode(14);
        TreeNode ll5 = new TreeNode(15);


        root.left = l2;
        root.right = l3;

        l2.left = l4;
        l2.right = l5;

        l3.left = l6;
        l3.right = l7;

        l4.left = l8;
        l4.right = l9;

        l5.left = ll0;
        l5.right = ll1;

        l6.left = ll2;
        l6.right = ll3;

        l7.left = ll4;
        l7.right = ll5;

        // _________________________________________________ 构造的另一颗树
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

        // -------------------------------------------------------------
        // 构造一棵树
        /**
                           1
                2                     5
         3           4                      6

         */
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

        // 一颗二叉搜索树的内容

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;


    }
}