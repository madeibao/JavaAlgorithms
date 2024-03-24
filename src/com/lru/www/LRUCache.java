package com.lru.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LruTest
 * @Author：Mayuan
 * @Date 2023/9/1/0001 15:20
 * @Description TODO
 * @Version 1.0
 **/
public class LRUCache {
    private Map<Integer, ListNode> cache;
    private int capacity;
    private ListNode protectHead = new ListNode();
    private ListNode protectTail = new ListNode();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        protectHead.next = protectTail;
        protectTail.pre = protectHead;
    }

    /**删除指定节点*/
    private void remove(ListNode listNode){
        listNode.pre.next = listNode.next;
        listNode.next.pre = listNode.pre;

        listNode.pre = null;
        listNode.next = null;
    }

    /** 添加末尾*/
    private void addToTail(ListNode listNode){

        protectTail.pre.next = listNode;
        listNode.pre = protectTail.pre;

        listNode.next = protectTail;
        protectTail.pre = listNode;

    }

    // 从当前位置移动到末尾
    private void moveToTail(ListNode listNode){

        this.remove(listNode);
        this.addToTail(listNode);

    }

    public int get(int key) {
        if(cache.containsKey(key)){
            ListNode listNode = cache.get(key);
            this.moveToTail(listNode);
            return listNode.value;
        }else{
            return -1;
        }

    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            // 将 key 移动到最新的位置
            // 1. 在旧的位置删除
            // 2. 追加key到链表末尾
            ListNode listNode = cache.get(key);

            // 这里必须重新赋值，虽然缓冲已经存在了，但是可能值不一样。
            listNode.value = value;
            this.moveToTail(listNode);
            return;

        }

        if(cache.size() == capacity){
            // 1. 找到最旧的数据，也就是链表的head，删除head
            // 2. 在cache map 中删除 head对应的key
            ListNode headNode = protectHead.next;
            this.remove(headNode);
            cache.remove(headNode.key);
        }


        // 1. 添加新的key到cache map
        // 2. 追加新的key到链表末尾

        ListNode listNode = new ListNode();
        listNode.key = key;
        listNode.value = value;

        this.addToTail(listNode);
        cache.put(key, listNode);

    }
}

class ListNode{
    int key;
    int value;
    ListNode pre;
    ListNode next;
}

