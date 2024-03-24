package com.stack.www;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @program: Pro1->Stack2
 * @description: 内置的栈的基本的操作内容
 * @author: MaYuan
 * @create: 2019-12-24 21:55
 * @version: 1.0
 * <p>
 * * Stack简介
 * Stack是栈。它的特性是：先进后出(FILO, First In Last Out)。
 * java工具包中的Stack是继承于Vector(矢量队列)的，由于Vector是通过数组实现的，
 * 这就意味着，Stack也是通过数组实现的，而非链表。当然，我们也可以将LinkedList当作栈来
 * <p>
 * java.lang.Object
 * ↳     java.util.AbstractCollection<E>
 * ↳     java.util.AbstractList<E>
 * ↳     java.util.Vector<E>
 * ↳     java.util.Stack<E>
 * <p>
 * public class Stack<E> extends Vector<E> {}
 * boolean       empty()
 * synchronized E             peek()
 * synchronized E             pop()
 * E             push(E object)
 * synchronized int           search(Object o)
 **/
public class Stack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        // 将1,2,3,4,5添加到栈中
        for (int i = 1; i < 6; i++) {
            stack.push(String.valueOf(i));
        }

        // 遍历并打印出该栈
        iteratorThroughRandomAccess(stack);

        // 查找“2”在栈中的位置，并输出
        int pos = stack.search("2");
        System.out.println("the postion of 2 is:" + pos);

        // pup栈顶元素之后，遍历栈
        stack.pop();
        iteratorThroughRandomAccess(stack);

        // peek栈顶元素之后，遍历栈
        String val = (String) stack.peek();
        System.out.println("peek:" + val);
        iteratorThroughRandomAccess(stack);

        // 通过Iterator去遍历Stack
        iteratorThroughIterator(stack);
    }

    /**
     * 通过快速访问遍历Stack
     */
    public static void iteratorThroughRandomAccess(List<String> list) {
        String val = null;
        for (int i = 0; i < list.size(); i++) {
            val = (String) list.get(i);
            System.out.print(val + " ");
        }
        System.out.println();
    }

    /**
     * 通过迭代器遍历Stack
     */
    public static void iteratorThroughIterator(List<String> list) {

        String val = null;
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            val = (String) iter.next();
            System.out.print(val + " ");
        }
        System.out.println();
    }
}






