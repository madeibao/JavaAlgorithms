package com.tree.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName SearchTree2
 * @Author：Mayuan
 * @Date 2020/7/19 10:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断数组是否为二叉搜索树。
 * 一棵满二叉树是否为二叉搜索树。
 * 10,5,15,3,7,13,18
 * True
 **/
public class SearchTree2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tree = reader.readLine().split(",");
        reader.close();
        boolean flag = isBinarySearchTree(tree, 0, 0, 65536);
        System.out.println(flag ? "True" : "False");
    }

    private static boolean isBinarySearchTree(String[] tree, int i, int min, int max) {
        if (i >= tree.length || "None".equals(tree[0])) {
            return true;
        }
        int value = Integer.parseInt(tree[i]);
        if (value <= min || value >= max) {
            return false;
        }
        return isBinarySearchTree(tree, 2 * i + 1, min, value) && isBinarySearchTree(tree, 2 * i + 2, value, max);
    }
}
