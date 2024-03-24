package com.linkedlist.www;

/**
 * @ClassName HuiWenList3
 * @Author：Mayuan
 * @Date 2020/6/22 22:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为回文的链表。
 * <p>
 * 这样的时间复杂度是 O(1)
 **/
public class HuiWenList3 {
    public boolean isPalindrome(ListNode head) {
        // 边界条件：空链表或只有一个节点的链表
        if (head == null || head.next == null) {
            return true;
        }

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        // 慢指针一次走一步，快指针一次走两步，当快指针走到终点，慢指针刚好处于中点位置
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // fast指针置于下半段链表的起点
        fast = slow.next;
        // 断开前后两个链表
        slow.next = null;
        // slow指针置于前半段链表的起点
        slow = dummyNode.next;


        // 反转后半段链表
        // 保存指针前一节点的信息，用于反转
        ListNode pre = null;
        while (fast != null) {
            ListNode nextTemp = fast.next;
            fast.next = pre;
            pre = fast;
            fast = nextTemp;
        }

        // 前后半链表逐一比较，当链表长度为奇数时前半段链表长度比后半段多1，所以以后半段为准
        while (pre != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{2, 3, 2});
        System.out.println(new HuiWenList3().isPalindrome(temp));
    }
}
