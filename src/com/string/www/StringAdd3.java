package com.string.www;

/**
 * @ClassName StringAdd3
 * @Author：Mayuan
 * @Date 2020/10/26 10:43
 * @Description TODO
 * @Version 1.0
 * 不管是几进制，加法都可以在此基础上改写，无论给的是链表、数组、字符串，其实乘法也可以但是乘完了还要移位相加改动比较大比较麻烦所以下面仅是加法的模板。
 * 相关题目：*43. 字符串相乘（CSDN题解）、415. 字符串相加（CSDN题解）、989. 数组形式的整数加法（CSDN题解）、67. 二进制求和（CSDN题解）、66. 加一（CSDN题解）、*445. 两数相加 II（CSDN题解）、*43. 字符串相乘（CSDN题解）
 * 注：暂时没有都写题解，所以先丢CSDN的笔记
 * <p>
 * 两个数同步从低位往高位遍历，while循环结束条件是两个数都遍历结束 while (l1 != null || l2 != null)
 * 设置进位 carry，初始值为 0
 * 每次遍历的时候都使用三元表达式提取出两个数当前要相加的位 int n1 = l1 != null ? l1.val : 0;这样写的优势是可以不管两个数的长度是否一致，其实就是比较短的数前面补0的效果
 * 取出当前要相加的位的数字 n1 和 n2，计算 sum = n1 + n2 + carry
 * 更新 carry = sum / 10， 而这一轮相加的结果个位就是 sum % 10，从低位往高位填入这个结果
 * 当 while循环 结束的时候说明两个数都遍历完了，但是还要考虑一下最后还有进位的情况，比如 1 + 99 = 100，即最后的和的位数比原来两个数最大位数还多一位的情况，所以最后要做一个 if (carry > 0)判断
 * <p>
 * // 这段代码是模板重点的地方，取数字存结果根据题目给的形式而定
 * int n1 = l1 != null ? l1.val : 0;
 * int n2 = l2 != null ? l2.val : 0;
 * int sum = n1 + n2 + carry;
 * carry = sum / 10;
 * 还可以将while循环结束条件改为while (l1 != null || l2 != null || carry > 0)，这样的话循环结束后就不需要判断if (carry > 0)了。相当于先将位数较少的数前面补0保持两数位数一致，再在两数前面再补一个0，如果最一轮循环 carry > 0 就是 0 + 0 + carry，效果一样的
 * <p>
 * 官方给的是没有头结点的链表，判断稍微繁琐了一点，改进写法，创造一个头节点，最后返回头结点的next
 * <p>
 * javacpp
 * <p>
 * <p>
 * 作者：Sophia_fez
 * 链接：https://leetcode-cn.com/problems/add-two-numbers/solution/mo-ni-jia-fa-tong-yong-mo-ban-by-sophia_fez/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class StringAdd3 {
    static class ListNode {

        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), cur = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) cur.next = new ListNode(carry);

        return head.next;
    }

    public static void main(String[] args) {
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n2.next = n3;
        n3.next = n4;
        n4.next = null;


        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(2);
        ListNode h4 = new ListNode(4);

        h2.next = h3;
        h3.next = h4;
        h4.next = null;

        ListNode res = addTwoNumbers(n2, h2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

    }
}
