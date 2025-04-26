package com.trie.ww;

/**
 * @ClassName LongestCommonChar
 * @Author：Mayuan
 * @Date 2025/4/26/星期六 21:08
 * @Version 1.0
 **/
public class LongestCommonChar {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int res = 0;
        Tire trie = new Tire();
        for (int i : arr1) {
            trie.add(i);
        }
        for (int i : arr2) {
            res = Math.max(res, trie.search(i));
        }
        return res;
    }

    class Tire {
        TrieNode root;

        public Tire() {
            root = new TrieNode();
        }

        public void add(int val) {
            TrieNode node = root;
            String word = String.valueOf(val);
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (node.children[c - '0'] == null) {
                    node.children[c - '0'] = new TrieNode();
                }
                node = node.children[c - '0'];
            }
        }

        public int search(int val) {
            TrieNode node = root;
            String word = String.valueOf(val);
            int len = 0;
            while (len < word.length()) {
                char c = word.charAt(len);
                if (node.children[c - '0'] == null) {
                    return len;
                }
                node = node.children[c - '0'];
                len++;
            }
            return len;
        }
    }

    class TrieNode {
        TrieNode[] children;

        public TrieNode() {
            children = new TrieNode[26];
        }
    }

    public static void main(String[] args) {
        LongestCommonChar longestCommonChar = new LongestCommonChar();
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        System.out.println(longestCommonChar.longestCommonPrefix(arr1, arr2));
    }
}