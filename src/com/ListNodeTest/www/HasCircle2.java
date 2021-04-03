package com.ListNodeTest.www;

/**
 * @ClassName HasCircle2
 * @Author：Mayuan
 * @Date 2021/3/30/0030 21:43
 * @Description TODO
 * @Version 1.0
 *
 * 环形链表2
 * leetcode 142
 * 找到环的入口地址。
 *
 *
 **/
public class HasCircle2 {
    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)  {
                break;
            }
        }

        // 以上的部分判断是否有环，如果有环。进行下一步。
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    /**
     * 首先判断链表中是否存在环，利用快慢指针：fast 指针一次走两步，slow 指针一次走一步。
     * 若链表中存在环，则 fast 指针和 slow 指针一定会相遇，即 fast == slow，
     * 此时令其中一个指针重新指向头节点 head 并且两个指针每次只走一步，则当两个指针再次相遇时，一定为环的开始；否则，返回 null 即可。
     * 1.先判断是否存在环
     * 2.当第一次快慢指针相遇时，说明存在环，此时相遇点在圆内，此时慢指针走过的距离是x+y，快指针走过的距离是x+y+z+y，
     * 因为快指针走过的距离是慢指针的2倍，所以得到等式2（x+y）= x+y+z+y,所以x = z
     * 3.接下来，令p = head，让p和slow同时再走一段距离为x的路程，二者就在环入口相遇
     *
     * 作者：zrita
     * 链接：https://leetcode-cn.com/problems/linked-list-cycle-ii/solution/zhi-guan-jian-tu-c-shuang-zhi-zhen-ha-xi-xxio/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param head
     * @return
     */
    public static ListNode detectCycle2(ListNode head) {

        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            // 如果链表有环，两个一起走。
            if (fast == slow) {

                fast = head;
                while (fast != slow) {

                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        ListNode res;
        res = detectCycle(n1);
        int count = 1;
        while (res!=null&&count!=4) {
            System.out.println(res.val+" ");
            res =res.next;
            count++;
        }
    }
}
