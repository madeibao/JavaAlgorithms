package com.ListNodeTest.www;


/**
 * @ClassName ReverseNode
 * @Author：Mayuan
 * @Date 2021/3/18/0018 22:30
 * @Description TODO
 * @Version 1.0
 **/
public class ReverseNode {

    public static ListNode reverse(ListNode head) {
        ListNode pre =null;
        while (head!=null) {
            ListNode next = head.next;
            head.next = pre;
            pre =head;
            head = next;
        }
        return pre;
    }

    /**
     * 递归实现链表逆置。
     */
    public static ListNode reverseTest(ListNode head) {
        // 递归一定有结束条件。
        if(head==null||head.next==null) {
            return head;
        }

        ListNode temp = reverseTest(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static void main(String[] args) {
        ListNode node =new ListNode(new int[]{1,2,3});
        ListNode res = reverseTest(node);
        System.out.println(res.toString());

    }
}
