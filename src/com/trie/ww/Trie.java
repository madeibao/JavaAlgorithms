package com.trie.ww;

/**
 * java的前缀树
 * @ClassName Trie
 * @Author：Mayuan
 * @Date 2025/4/19/星期六 19:50
 * @Description TODO
 * @Version 1.0
 **/
public class Trie {
    private Trie[] children;
    private boolean isEnd;

    // 构造函数初始化
    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    // 插入元素
    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.children[ch - 'a'] == null) {
                return null;
            }
            node = node.children[ch - 'a'];
        }
        return node;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("appleaa");
        trie.insert("appleabc");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("apple"));
    }
}
