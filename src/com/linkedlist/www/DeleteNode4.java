package com.linkedlist.www;

/**
 * @ClassName DeleteNode4
 * @Author：Mayuan
 * @Date 2020/4/12 22:07
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除链表中的重复的节点，
 * 只有有重复节点，则删除之。
 **/
public class DeleteNode4 {

    /**
     * 通过递归的方式来实现链表的删除
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        }
        else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2, 5, 6,};
        ListNode head = new ListNode(nums);
        ListNode temp = deleteDuplicates(head);
        System.out.println(temp);
    }
}
