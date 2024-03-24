package com.string.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @ClassName MinEncodeLength
 * @Author：Mayuan
 * @Date 2020/7/11 21:37
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个字符串的最小的编码的长度值。
 **/
public class MinEncodeLength {
    static class TreeNode {
        int w;
        Character c;
        TreeNode left;
        TreeNode right;

        public TreeNode(int w) {
            this.w = w;
        }

        public TreeNode(int w, char c) {
            this.w = w;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(hafuman(str));
        }
    }

    /**
     * 首先建立一个哈希表。
     */
    public static int hafuman(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char c;
        int num;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (map.containsKey(c)) {
                num = (int) map.get(c);
                map.put(c, num + 1);
            } else {
                map.put(c, 1);
            }
        }


        // 实现一个优先权队列的值。
        Queue<TreeNode> q = new PriorityQueue<>(map.size(),
                new Comparator<TreeNode>() {
                    @Override
                    public int compare(TreeNode o1, TreeNode o2) {
                        // TODO Auto-generated method st
                        return Integer.compare(o1.w, o2.w);
                    }
                });

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            q.offer(new TreeNode(entry.getValue(), entry.getKey()));
        }

        while (q.size() > 1) {
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            TreeNode father = new TreeNode(left.w + right.w);
            father.left = left;
            father.right = right;
            q.offer(father);
        }
        TreeNode root = q.poll();
        return calLen(root, 0);
    }

    public static int calLen(TreeNode node, int depth) {
        if (node == null) {
            return 0;
        }
        return (node.c == null ? 0 : node.w) * depth + calLen(node.left, depth + 1) + calLen(node.right, depth + 1);
    }
}
