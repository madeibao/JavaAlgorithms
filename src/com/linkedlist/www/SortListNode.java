package com.linkedlist.www;

/**
 * @ClassName SortListNode
 * @Author：Mayuan
 * @Date 2020/6/6 15:53
 * @Description TODO
 * @Version 1.0
 * 一个链表，来进行排序。
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2:
 * <p>
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 ***/
public class SortListNode {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 设置快慢的两个指针。
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 断开
        ListNode tmp = slow.next;
        slow.next = null;

        // 递归调用结果值。
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);

        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }

        h.next = left != null ? left : right;
        return res.next;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 3};
        ListNode res = new ListNode(nums);

        ListNode res2 = sortList(res);
        System.out.println(res2);
    }
}
