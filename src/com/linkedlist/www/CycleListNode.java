package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->CycleListNode
 * @description: 判断链表是否有环
 * @author: MaYuan
 * @create: 2019-12-29 19:46
 * @version: 1.0
 * <p>
 * 如果快的指针追上慢的指针，那么就一定存在环状的链表。
 **/
public class CycleListNode {

    /**
     * 链表实现的快慢指针的算法内容。
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {

        /**
         * 设置两个指针的内容，快慢指针来更好的解决问题。
         */
        ListNode fast = head;
        ListNode slow = head;

        if (head == null || head.next == null) {
            return false;
        }

        while (fast != null && fast.next != null && slow != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(0);
        ListNode h4 = new ListNode(4);

        head.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h2;

        // 最后的一个节点，又指向了节点2，表示的是为环状的列表。
        System.out.println(hasCycle(head));
    }
}




