package com.linkedlist.www;

/**
 * @ClassName DeleteRepeatNode3
 * @Author：Mayuan
 * @Date 2020/10/11 15:54
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除链表的重复的节点。
 * 保持节点的唯一性
 * <p>
 * // 删除链表中的重复的节点值。
 **/
public class DeleteRepeatNode3 {

    public static ListNode deleteNode(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7});
        ListNode res = deleteNode(temp);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
