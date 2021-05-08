package com.linkedlist.www;

/**
 * @ClassName ReverseListNode9
 * @Author：Mayuan
 * @Date 2021/1/15/0015 16:50
 * @Description TODO
 * @Version 1.0
 *
 * 递归的写法啦实现链表的逆置操作。
 **/
public class ReverseListNode9 {

    private static ListNode reverse(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }

        ListNode res = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
    public static void main(String[] args) {

        ListNode res = new ListNode(new int[]{1,2,3,4});
        ListNode res2 = reverse(res);
        while (res2!=null) {
            System.out.print(res2.val+" ");
            res2 =res2.next;
        }
    }
}
