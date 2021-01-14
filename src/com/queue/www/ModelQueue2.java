package com.queue.www;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName ModelQueue2
 * @Author：Mayuan
 * @Date 2020/4/26 23:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 6
 * add 1
 * add 2
 * add 3
 * peek
 * poll
 * peek
 * <p>
 * 利用两个栈来模拟一个队列内容。
 **/
public class ModelQueue2 {
    private static Stack<Integer> stackPush;
    private static Stack<Integer> stackPop;

    public static void main(String[] args) {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String string;
        for (int i = 0; i < n; i++) {
            string = scanner.nextLine();
            if (string.equals("poll")) {
                poll();
            } else if (string.equals("peek")) {
                System.out.println(peek());
            } else {
                add(Integer.valueOf(string.split(" ")[1]));
            }
        }
    }

    public static void add(int number) {
        stackPush.push(number);
    }

    public static int poll() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Your queue is empty!");
        }
        pushToPop();
        return stackPop.pop();
    }

    public static int peek() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Your queue is empty!");
        }
        pushToPop();
        return stackPop.peek();
    }

    private static void pushToPop() {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }
}
