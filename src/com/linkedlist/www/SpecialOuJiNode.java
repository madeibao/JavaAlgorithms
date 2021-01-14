package com.linkedlist.www;

/**
 * @ClassName SpecialOuJiNode
 * @Author：Mayuan
 * @Date 2020/3/30 18:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 将链表中的节点，按照奇偶的顺序来进心链接起来。
 * <p>
 * 应该金量用一遍扫描的方法来实现。
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class SpecialOuJiNode {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 5};
        ListNode node = new ListNode(nums);
        ListNode temp = oddEvenList(node);
        System.out.println(temp);

    }
}
