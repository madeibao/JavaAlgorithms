package com.datastructure.www;

/**
 * @program: Pro1->Stack2
 * @description: java的基本的栈的操作
 * @author: MaYuan
 * @create: 2019-12-23 18:50
 * @version: 1.0
 * * java的内置的栈的结构。
 * E push(E item)
 * 把项压入堆栈顶部。
 * E pop()
 * 移除堆栈顶部的对象，并作为此函数的值返回该对象。
 * E peek()
 * 查看堆栈顶部的对象，但不从堆栈中移除它。
 * boolean empty()
 * 测试堆栈是否为空。
 * int search(Object o)
 * 返回对象在堆栈中的位置，以 1 为基数。
 **/

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        stackMethod();
    }

    public static void stackMethod() {
        //定义一个Integer泛型的Stack
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("新建栈stack是否为空 : " + (stack.empty() ? "空" : stack.size()));
        //push : 把项压入堆栈顶部，返回值泛型指定的类型
        //此处将1到5压入栈中
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("将1到5按顺序压入栈中后为：" + stack);
        //empty : 测试堆栈是否为空，size() == 0，返回值boolean
        System.out.println("值为1~5的栈中stack是否为空 : " + (stack.empty() ? "空" : stack.size()));
        //search : 返回对象在堆栈中的位置，以 1 为基数，参数：search(Object o) ，返回值int
        int oStack = stack.search(3);
        System.out.println("查找栈stack中对象3的位置elementId为 : " + oStack);
        //peek : 查看堆栈顶部的对象，但不从堆栈中移除它，返回值泛型指定的类型
        int topElement = stack.peek();
        System.out.println("查看stack的栈顶元素为 : " + topElement);

        System.out.println("peek操作stack后为 : " + stack);
        //pop : 移除堆栈顶部的对象，并作为此函数的值返回该对象，返回值泛型指定的类型
        int oRemove = stack.pop();

        System.out.println("移除stack栈顶的元素为 : " + oRemove);
        System.out.println("pop操作移除stack栈顶元素后为 : " + stack);
    }
}