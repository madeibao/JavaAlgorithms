package com.ListNodeTest.www;

/**
 * @ClassName ReverseKthNode
 * @Author：Mayuan
 * @Date 2021/3/19/0019 15:13
 * @Description TODO
 * @Version 1.0
 *
 * K个一组来进行链表的翻转。
 **/
public class ReverseKthNode {

    public static ListNode reverseKthNode(ListNode head, int k) {
        ListNode tail =head;
        for(int i=0;i<k;i++) {

            // 假定的是不满足k个节点大小。
            if(tail==null) {
                return head;
            }
            tail =tail.next;
        }

        ListNode newHead = reverse(head, tail);
        // 递归的翻转链表的节点值。
        head.next = reverseKthNode(tail,k);
        return newHead;
    }

    // 构造一个辅助函数
    /**
     * 前面闭区间，后面开区间的范围结构。
     */

    private static ListNode reverse(ListNode head, ListNode tail) {
        ListNode pre = null;
        while (head!=tail) {
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        return pre;
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(new int[]{1,2,3,4,5,6,7,8,9});
        int k =3;
        ListNode res= reverseKthNode(node, k);
        System.out.println(res.toString());
    }
}
