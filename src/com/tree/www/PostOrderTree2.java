package com.tree.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName PostOrderTree2
 * @Author：Mayuan
 * @Date 2020/4/7 15:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二叉树的后序的遍历，只是借助栈来实现。
 **/
public class PostOrderTree2 {

    public static List<Integer> postorderTraversal(TreeNode head) {
        if (head == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(head);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            res.add(stack2.pop().val);
        }

        return res;
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

        List<Integer> list2 = postorderTraversal(n1);
        list2.forEach(System.out::println);
    }
}
