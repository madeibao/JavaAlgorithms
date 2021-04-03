package com.ListNodeTest.www;

/**
 * @ClassName DeleteDuplicateNode
 * @Author：Mayuan
 * @Date 2021/3/29/0029 12:36
 * @Description TODO
 * @Version 1.0
 *
 * 删除链表的重复元素。
 * 保留只出现一次的数字。
 **/
public class DeleteDuplicateNode {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }

        if(head.next!=null&&head.val==head.next.val) {
            while (head.next!=null&&head.val==head.next.val) {
                head= head.next;
            }
            return deleteDuplicates(head.next);
        }
        else {
            head.next = deleteDuplicates(head.next);
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode node =new ListNode(new int[]{1,2,2,3,4});
        ListNode res =deleteDuplicates(node);
        System.out.println(res);

    }
}
