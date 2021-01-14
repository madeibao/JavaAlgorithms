package com.linkedlist.www;

/**
 * @ClassName ExchangeListNode
 * @Author：Mayuan
 * @Date 2020/6/8 20:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 链表中的节点两个两个的来进行交换。
 * 递归的写法来实现交换链表操作。
 **/

public class ExchangeListNode {
    public static ListNode swapPairs(ListNode head) {
        // 1. 终止条件：当前没有节点或者只有一个节点，肯定就不需要交换了
        if (head == null || head.next == null) return head;

        // 2. 调用单元
        // 需要交换的两个节点是 head 和 head.next
        ListNode firstNode = head;

        ListNode secondNode = head.next;
        // firstNode 连接后面交换完成的子链表
        // 递归的链接后面的节点，递归的完成交换
        firstNode.next = swapPairs(secondNode.next);
        // secondNode 连接 firstNode
        secondNode.next = firstNode;

        // 3. 返回值：返回交换完成的子链表
        // secondNode 变成了头结点
        // 返回的是第二个节点的值。
        return secondNode;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{1, 2, 3, 4});
        ListNode res = swapPairs(temp);
        System.out.println(res);

    }
}
