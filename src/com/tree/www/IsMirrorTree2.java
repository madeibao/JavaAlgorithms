package com.tree.www;


import java.util.LinkedList;

/**
 * @ClassName IsMirrorTree2
 * @Author：Mayuan
 * @Date 2020/3/23 22:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断一颗二叉树是否为对称的二叉树
 **/
public class IsMirrorTree2 {

    private static boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        //用队列保存节点
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        //将根节点的左右孩子放到队列中
        queue.add(root.left);
        queue.add(root.right);
        while (queue.size() > 0) {
            //从队列中取出两个节点，再比较这两个节点
            TreeNode left = queue.removeFirst();
            TreeNode right = queue.removeFirst();
            //如果两个节点都为空就继续循环，两者有一个为空就返回false
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            //将左节点的左孩子， 右节点的右孩子放入队列
            queue.add(left.left);
            queue.add(right.right);
            //将左节点的右孩子，右节点的左孩子放入队列
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode binTree = new TreeNode(15);
        TreeNode left1 = new TreeNode(14);
        TreeNode right = new TreeNode(14);
        binTree.left = left1;
        binTree.right = right;

        System.out.println(isSymmetric(binTree));

    }
}
