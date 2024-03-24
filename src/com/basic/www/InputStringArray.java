package com.basic.www;

import java.util.Scanner;

/**
 * @ClassName InputStringArray
 * @Author：Mayuan
 * @Date 2020/4/29 18:07
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最后我们再来总结一下 nextLine 与 next 两个方法的区别：
 * <p>
 * next 不会接收回车符，tab 或者空格键，在接收有效数据之前会忽略这些符号，若已经读取了有效数据，遇到这些符号会直接退出
 * nextLine 可以接收空格或者 tab 键，其输入以 enter 键结束
 * <p>
 * 一生要强的博主在笔试惨败之后去查阅了 nextLine 方法的用法，发现 nextLine 可以接收空格或者 tab 键，其输入以 enter 键结束。
 * <p>
 * 这倒是能解释通了！程序在通过 nextInt 方法读取数字之后，会留下一个 enter 键，
 * 这个 enter 键会被第一个执行的 nextLine 函数接收，
 * 这导致我们能够读取的数据永远少一行（nextLine 少执行一次），同时也能解释为什么字符串数组第一个元素为空。
 * <p>
 * 这个问题怎么解决呢？Java 输入类读取字符串的函数并非只有 nextLine，
 * 通过 next 也能实现类似的功能，只不过 next 与 nextLine 不同，next 不会接收回车符，tab 或者空格键。
 * 在我们使用 nextLine 时，需要注意前面是否有 enter 键，如果有，就会被 nextLine 吸收，从而造成 bug！
 * <p>
 * 既然明白了 nextLine 与 next 的原理，解决问题就变得简单了，
 * 将读取字符串的函数由 nextLine 改为 next 便可，这样就不会吸收 nextInt 留下的 enter 键了。改进过的程序如下：
 * ————————————————
 * 版权声明：本文为CSDN博主「Geffin」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/Geffin/article/details/105253700
 **/
public class InputStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int index = 0;
        String[] array = new String[i];
        while (index < i) {
            array[index++] = sc.next();
            // 注意不能用sc.nextLine()来进行输入。
        }

        for (String str : array) {
            System.out.println("输入的字符串：" + str);
        }
    }
}
