package com.tree.www;

import java.util.List;

/**
 * @ClassName Node
 * @Author：Mayuan
 * @Date 2020/2/22 22:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * n叉树的节点的构造。
 * <p>
 * N 叉树的节点构造。
 **/
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
