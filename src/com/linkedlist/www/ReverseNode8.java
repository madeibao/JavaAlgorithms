package com.linkedlist.www;

/**
 * @ClassName ReverseNode8
 * @Author：Mayuan
 * @Date 2020/11/18 20:35
 * @Description TODO
 * @Version 1.0
 * <p>
 * 逆置链表的结构。
 **/
public class ReverseNode8 {

    private static ListNode reverse(ListNode head) {

        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNode res = reverse(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
