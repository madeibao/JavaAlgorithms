package com.datastructure.www;

import java.util.LinkedList;

/**
 * @ClassName LinkedListTest
 * @Author：Mayuan
 * @Date 2020/6/6 21:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的方法。
 * <p>
 * 链表的实现具有，插入和删除元素比较方便，
 * 然后查找不变，从头查找。
 * LinkedList其实也就是我们在数据结构中的链表，这种数据结构有这样的特性：
 * <p>
 * 分配内存空间不是必须是连续的；
 * 插入、删除操作很快，只要修改前后指针就OK了，时间复杂度为O(1)；
 * 访问比较慢，必须得从第一个元素开始遍历，时间复杂度为O(n)；
 * 在Java中，LinkedList提供了丰富的方法，可以模拟链式队列，链式堆栈等数据结构，为用户带来了极大的方便，下面看看这些方法的用法：
 * <p>
 * add
 * boolean add(E e)：在链表后添加一个元素，如果成功，返回true，否则返回false；
 * void addFirst(E e)：在链表头部插入一个元素；
 * addLast(E e)：在链表尾部添加一个元素；
 * void add(int index, E element)：在指定位置插入一个元素。
 * <p>
 * 下面是代码演示：
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.add("first");
 * linkedList.add("second");
 * linkedList.add("third");
 * System.out.println(linkedList);
 * <p>
 * linkedList.addFirst("addFirst");
 * System.out.println(linkedList);
 * <p>
 * linkedList.addLast("addLast");
 * System.out.println(linkedList);
 * <p>
 * linkedList.add(2, "addByIndex");
 * System.out.println(linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 输出：
 * <p>
 * [first, second, third]
 * [addFirst, first, second, third]
 * [addFirst, first, second, third, addLast]
 * [addFirst, first, addByIndex, second, third, addLast]
 * 1
 * 2
 * 3
 * 4
 * remove
 * E remove()；移除链表中第一个元素；
 * boolean remove(Object o)：移除链表中指定的元素；
 * E remove(int index)：移除链表中指定位置的元素；
 * E removeFirst()：移除链表中第一个元素，与remove类似；
 * E removeLast()：移除链表中最后一个元素；
 * boolean removeFirstOccurrence(Object o)：移除链表中第一次出现所在位置的元素；
 * boolean removeLastOccurrence(Object o)：移除链表中最后一次出现所在位置的元素；
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.add("first");
 * linkedList.add("second");
 * linkedList.add("second");
 * linkedList.add("third");
 * linkedList.add("four");
 * linkedList.add("five");
 * System.out.println(linkedList);
 * <p>
 * linkedList.remove();
 * System.out.println("remove: " + linkedList);
 * <p>
 * linkedList.remove("second");
 * System.out.println("remove(Object): " + linkedList);
 * <p>
 * linkedList.remove("six");
 * System.out.println("remove(Object) not exist: " + linkedList);
 * <p>
 * linkedList.remove(2);
 * System.out.println("remove(index): " + linkedList);
 * <p>
 * linkedList.removeFirst();
 * System.out.println("removeFirst: " + linkedList);
 * <p>
 * linkedList.removeLast();
 * System.out.println("removeLast:" + linkedList);
 * <p>
 * System.out.println("----------------------------------");
 * linkedList.clear();
 * <p>
 * linkedList.add("first");
 * linkedList.add("second");
 * linkedList.add("first");
 * linkedList.add("third");
 * linkedList.add("first");
 * linkedList.add("five");
 * System.out.println(linkedList);
 * <p>
 * linkedList.removeFirstOccurrence("first");
 * System.out.println("removeFirstOccurrence: " + linkedList);
 * <p>
 * linkedList.removeLastOccurrence("first");
 * System.out.println("removeLastOccurrence: " + linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 20
 * 21
 * 22
 * 23
 * 24
 * 25
 * 26
 * 27
 * 28
 * 29
 * 30
 * 31
 * 32
 * 33
 * 34
 * 35
 * 36
 * 37
 * 38
 * 39
 * 40
 * 41
 * 42
 * 43
 * 44
 * 45
 * 46
 * 47
 * 48
 * 输出：
 * <p>
 * [first, second, second, third, four, five]
 * remove: [second, second, third, four, five]
 * remove(Object): [second, third, four, five]
 * remove(Object) not exist: [second, third, four, five]
 * remove(index): [second, third, five]
 * removeFirst: [third, five]
 * removeLast:[third]
 * ----------------------------------
 * [first, second, first, third, first, five]
 * removeFirstOccurrence: [second, first, third, first, five]
 * removeLastOccurrence: [second, first, third, five]
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * get
 * E get(int index)：按照下边获取元素；
 * E getFirst()：获取第一个元素；
 * E getLast()：获取第二个元素；
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.add("first");
 * linkedList.add("second");
 * linkedList.add("second");
 * linkedList.add("third");
 * linkedList.add("four");
 * linkedList.add("five");
 * System.out.println(linkedList);
 * <p>
 * linkedList.get(3);
 * System.out.println("get(index): " + linkedList.get(3));
 * <p>
 * linkedList.getFirst();
 * System.out.println("getFirst: " + linkedList.getFirst());
 * <p>
 * linkedList.getLast();
 * System.out.println("getLast: " + linkedList.getLast());
 * <p>
 * System.out.println(linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 20
 * 21
 * 22
 * 23
 * 24
 * 输出：
 * <p>
 * [first, second, second, third, four, five]
 * get(index): third
 * getFirst: first
 * getLast: five
 * [first, second, second, third, four, five]
 * 1
 * 2
 * 3
 * 4
 * 5
 * 注意到了，链表前后没有产生变化。
 * <p>
 * push、pop、poll
 * void push(E e)：与addFirst一样，实际上它就是addFirst；
 * E pop()：与removeFirst一样，实际上它就是removeFirst；
 * E poll()：查询并移除第一个元素；
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.push("first");
 * linkedList.push("second");
 * linkedList.push("second");
 * linkedList.push("third");
 * linkedList.push("four");
 * linkedList.push("five");
 * System.out.println("linkedList: " + linkedList);
 * <p>
 * System.out.println("pop: " + linkedList.pop());
 * System.out.println("after pop: " + linkedList);
 * <p>
 * System.out.println("poll: " + linkedList.poll());
 * System.out.println("after poll: " + linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 输出：
 * <p>
 * linkedList: [five, four, third, second, second, first]
 * pop: five
 * after pop: [four, third, second, second, first]
 * poll: four
 * after poll: [third, second, second, first]
 * 1
 * 2
 * 3
 * 4
 * 5
 * 通过代码示例可以看出：push，pop的操作已经很接近stack的操作了。
 * <p>
 * 如果链表为空的时候，看看poll与pop是啥区别：
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * System.out.println("poll: " + linkedList.poll());
 * System.out.println("pop: " + linkedList.pop());
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 输出：
 * <p>
 * poll: null
 * Exception in thread "main" java.util.NoSuchElementException
 * at java.util.LinkedList.removeFirst(LinkedList.java:270)
 * at java.util.LinkedList.pop(LinkedList.java:801)
 * at org.ks.algorithm.LinkedListMethodsDemo.main(LinkedListMethodsDemo.java:13)
 * at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 * at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 * at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 * at java.lang.reflect.Method.invoke(Method.java:483)
 * at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 可以看出poll返回null，而pop则产生异常。
 * <p>
 * peek
 * E peek()：获取第一个元素，但是不移除；
 * E peekFirst()：获取第一个元素，但是不移除；
 * E peekLast()：获取最后一个元素，但是不移除；
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.push("first");
 * linkedList.push("second");
 * linkedList.push("second");
 * linkedList.push("third");
 * linkedList.push("four");
 * linkedList.push("five");
 * System.out.println("linkedList: " + linkedList);
 * <p>
 * System.out.println("peek: " + linkedList.peek());
 * System.out.println("peekFirst: " + linkedList.peekFirst());
 * System.out.println("peekLast: " + linkedList.peekLast());
 * <p>
 * System.out.println("linkedList: " + linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 输出：
 * <p>
 * linkedList: [five, four, third, second, second, first]
 * peek: five
 * peekFirst: five
 * peekLast: first
 * linkedList: [five, four, third, second, second, first]
 * 1
 * 2
 * 3
 * 4
 * 5
 * 如果没找到对应的元素，统统输出null：
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * System.out.println("linkedList: " + linkedList);
 * System.out.println("peek: " + linkedList.peek());
 * System.out.println("peekFirst: " + linkedList.peekFirst());
 * System.out.println("peekLast: " + linkedList.peekLast());
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 输出：
 * <p>
 * linkedList: []
 * peek: null
 * peekFirst: null
 * peekLast: null
 * 1
 * 2
 * 3
 * 4
 * offer
 * boolean offer(E e)：在链表尾部插入一个元素；
 * boolean offerFirst(E e)：与addFirst一样，实际上它就是addFirst；
 * boolean offerLast(E e)：与addLast一样，实际上它就是addLast；
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.push("first");
 * linkedList.push("second");
 * linkedList.push("second");
 * linkedList.push("third");
 * linkedList.push("four");
 * linkedList.push("five");
 * System.out.println("linkedList: " + linkedList);
 * <p>
 * linkedList.offer("six");
 * System.out.println("linkedList: " + linkedList);
 * <p>
 * linkedList.offerFirst("zero");
 * System.out.println("linkedList: " + linkedList);
 * <p>
 * linkedList.offerLast("seven");
 * System.out.println("linkedList: " + linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 20
 * 21
 * 22
 * 输出：
 * <p>
 * linkedList: [five, four, third, second, second, first]
 * linkedList: [five, four, third, second, second, first, six]
 * linkedList: [zero, five, four, third, second, second, first, six]
 * linkedList: [zero, five, four, third, second, second, first, six, seven]
 * 1
 * 2
 * 3
 * 4
 * 其他
 * LinkedList中常用的方法基本都列出来了，当然还有一些其他的例子，这里就一起演示了：
 * <p>
 * public class LinkedListMethodsDemo {
 * public static void main(String[] args) {
 * LinkedList<String> linkedList = new LinkedList<>();
 * <p>
 * linkedList.push("first");
 * linkedList.push("second");
 * linkedList.push("second");
 * linkedList.push("third");
 * linkedList.push("four");
 * linkedList.push("five");
 * System.out.println("linkedList: " + linkedList);
 * <p>
 * System.out.println("linkedList.contains(\"second\"): " + linkedList.contains("second"));
 * System.out.println("linkedList.contains(\"six\"): " + linkedList.contains("six"));
 * System.out.println("linkedList.element(): " + linkedList.element());
 * System.out.println("linkedList: " + linkedList);
 * System.out.println("linkedList.set(3, \"set\"): " + linkedList.set(3, "set"));
 * System.out.println("linkedList: " + linkedList);
 * System.out.println("linkedList.subList(2,4): " + linkedList.subList(2,4));
 * System.out.println("linkedList: " + linkedList);
 * }
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 18
 * 19
 * 20
 * 21
 * 22
 * 输出：
 * <p>
 * linkedList: [five, four, third, second, second, first]
 * linkedList.contains("second"): true
 * linkedList.contains("six"): false
 * linkedList.element(): five
 * linkedList: [five, four, third, second, second, first]
 * linkedList.set(3, "set"): second
 * linkedList: [five, four, third, set, second, first]
 * linkedList.subList(2,4): [third, set]
 * linkedList: [five, four, third, set, second, first]
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 从输出可以看出，除了set改变原linkedlist，其他几个方法都不改变原链表。
 * ————————————————
 * 版权声明：本文为CSDN博主「K.Sun」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/sinat_36246371/article/details/53709625
 **/

/**
 *
 * linkedlist是双向的链表。
 */

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(2);
        list2.add(3);
        list2.add(2);

        // 在指定的位置来添加一个元素。
        list2.add(1, 9);

        // 能在头部和尾部来进行插入。
        list2.addFirst(10);
        System.out.println(list2);

    }
}
