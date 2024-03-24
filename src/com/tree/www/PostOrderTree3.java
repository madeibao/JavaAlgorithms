package com.tree.www;

/**
 * @ClassName PostOrderTree3
 * @Author：Mayuan
 * @Date 2021/1/1/0001 19:47
 * @Description TODO
 * @Version 1.0
 *
 * 判断是否为二叉搜索树的后序遍历序列。
 *
 *
 **/
public class PostOrderTree3 {

    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 2) {
            return true;
        }
        return verify(postorder, 0, postorder.length - 1);
    }

    /** 递归实现 */
    private static boolean verify(int[] postorder, int left, int right) {
        // 当前区域不合法的时候直接返回true就好
        if (left >= right) {
            return true;
        }

        // 当前树的根节点的值
        int rootValue = postorder[right];

        int k = left;
        // 从当前区域找到第一个大于根节点的，说明后续区域数值都在右子树中
        while (k < right && postorder[k] < rootValue) {
            k++;
        }


        // 进行判断后续的区域是否所有的值都是大于当前的根节点，如果出现小于的值就直接返回false
        for (int i = k; i < right; i++) {
            if (postorder[i] < rootValue) {
                return false;
            }
        }

        // 当前树没问题就检查左右子树

        if (!verify(postorder, left, k - 1)) {
            // 检查左子树
            return false;
        }

        if (!verify(postorder, k, right - 1)) {
            // 检查右子树
            return false;
        }
        // 最终都没问题就返回true
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,6,5};
        System.out.println(verifyPostorder(nums));
    }
}
