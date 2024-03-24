package com.stack.www;

/**
 * @ClassName ArrayStack
 * @Author：Mayuan
 * @Date 2021/4/1/0001 15:23
 * @Description TODO
 * @Version 1.0
 *
 * 用数组来模拟一个栈，并实现栈的基本操作。
 **/

public class ArrayStack<E> implements Stack<E> {

    //这个Array<E>是自己封装的，内容详见 https://blog.csdn.net/qq_43594119/article/details/105183123
    Array<E> array;

    //有参构造
    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }
    //无参构造
    public ArrayStack() {
        array = new Array<>();//使用Array类里的无参构造
    }

    //获取栈的最大容量
    public int getCapacity() {
        return array.getCapacity();//调用的方法也是自己封装的Array类里的方法
    }

    //对接口中的方法进行重写
    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    //入栈
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    //出栈
    @Override
    public E pop() {
        return array.removeLast();
    }

    //查看栈顶元素
    @Override
    public E peek() {
        return array.getLast();
    }

    //对toString方法进行重写，方便输出栈的基本信息
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize()-1) {
                res.append(", ");
            }
        }
        res.append("] top");//表明右侧是栈顶
        return res.toString();
    }
}
