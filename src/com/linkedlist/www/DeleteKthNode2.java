package com.linkedlist.www;

/**
 * @ClassName DeleteKthNode2
 * @Author：Mayuan
 * @Date 2021/5/7/0007 15:36
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表的倒数的第k个节点的值。
 * 快慢指针的算法来解决问题。
 *
 **/
public class DeleteKthNode2 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart

//        for (int i = 1; i <= n + 1; i++) {
//            first = first.next;
//        }

        //  由于前面有一个虚拟的头节点，所以向前面走了 n+1 个步骤。

        for(int i=0;i<=n;i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(new int[]{1,2,3,4,5,6,7,8});
        int n =2;
        ListNode node2 = removeNthFromEnd(node, n);
        System.out.println(node2);

    }
}
