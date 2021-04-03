package com.tree.www;

/**
 * @ClassName SameTree
 * @Author：Mayuan
 * @Date 2021/3/29/0029 9:18
 * @Description TODO
 * @Version 1.0
 *
 * 相同的树。
 *  判断两棵树是否相同。
 **/
public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) {
            return true;
        }

        if(p!=null&&q!=null&&p.val==q.val) {
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(5);

        n1.left= n3;
        n1.right = n4;

        System.out.println(isSameTree(n1,n1));
    }
}
