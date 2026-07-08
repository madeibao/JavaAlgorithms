package com.trie.ww;

/**
 *
 * @ClassName AddWords
 * @Author Mayuan
 * @Date 2026/7/8/星期三 11:17
 * @Version 1.0
 **/
public class WordDictionary {

    static class TrieNode {
        boolean val;
        TrieNode[] children = new TrieNode[26];
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode p = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (p.children[i] == null) {
                p.children[i] = new TrieNode();
            }
            p = p.children[i];
        }
        p.val = true;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(TrieNode node, String key, int index) {
        if (node == null) {
            return false;
        }
        if (index == key.length()) {
            return node.val;
        }
        int i = key.charAt(index) - 'a';
        if (key.charAt(index) == '.') {
            for (int j = 0; j < 26; j++) {
                if (search(node.children[j], key, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return search(node.children[i], key, index + 1);
        }
    }

    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        System.out.println(obj.search("mad"));
    }
}
