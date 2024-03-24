package com.stack.www;

/**
 * @ClassName Test
 * @Author：Mayuan
 * @Date 2021/4/1/0001 15:36
 * @Description TODO
 * @Version 1.0
 **/
/**
 * @author yinglongwu
 */
public class Test {

    public static void main(String[] args) {

        //测试class ArrayStack
        //new ArrayStack<Integer>()里的Integer可写可不写
        ArrayStack<Integer> stack = new ArrayStack<Integer>();

        //包装类和其对应的基本数据类型可以自动转换
        //将0到4入栈
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        //出一次栈
        stack.pop();
        System.out.println(stack);
    }

}
