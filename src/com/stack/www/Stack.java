package com.stack.www;

/**
 * @ClassName Stack
 * @Author：Mayuan
 * @Date 2021/4/1/0001 15:29
 * @Description TODO
 * @Version 1.0
 *
 * 首先定义一个接口。
 **/

public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);//入栈
    E pop();//出栈
    E peek();//查看栈顶元素
}
