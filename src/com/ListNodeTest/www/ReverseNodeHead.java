package com.ListNodeTest.www;

/**
 * @ClassName ReverseNodeHead
 * @Author：Mayuan
 * @Date 2023/8/29/0029 21:43
 * @Description TODO
 * @Version 1.0
 **/

/**
 * 用头插法来逆置链表
 * @author ASUS
 */
public class ReverseNodeHead {

    static ListNode reverse(ListNode head) {
        ListNode dummy = new ListNode(-1);

        ListNode p = head;

        while (p!=null) {
            head= head.next;
            p.next = dummy.next;
            dummy.next = p;
            p = head;
        }
        return dummy.next;
    }


    public static void main(String[] args) {

        ListNode head =new ListNode(new int[]{1,2,3,4,5});
        ListNode res = reverse(head);
        while (res!=null) {
            System.out.print(res.val+" ");
            res =res.next;
        }

    }
}
