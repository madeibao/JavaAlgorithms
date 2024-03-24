package com.queue.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @ClassName Stack2Queue
 * @Author：Mayuan
 * @Date 2020/8/9 22:02
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
 **/
public class Stack2Queue {

    private static Stack<Integer> aStack = new Stack<>();
    private static Stack<Integer> bStack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());

        StringBuilder result = new StringBuilder();

        while (n-- > 0) {
            String str = in.readLine();

            if (str.equals("poll")) {
                poll();
            } else if (str.equals("peek")) {
                result.append(peek()).append('\n');
            } else {
                add(Integer.valueOf(str.split(" ")[1]));
            }
        }
        System.out.println(result.substring(0));
    }

    private static void add(int num) {
        aStack.push(num);
    }

    private static void aTob() {
        if (bStack.isEmpty()) {
            while (!aStack.isEmpty()) {
                bStack.push(aStack.pop());
            }
        }
    }

    private static int poll() {
        aTob();
        return bStack.pop();
    }

    private static int peek() {
        aTob();
        return bStack.peek();
    }

}