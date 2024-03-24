package com.BasicThreadTest.www;

/**
 * @ClassName JoinFunctionTest
 * @Author：Mayuan
 * @Date 2020/6/29 10:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 线程的join方法测试。
 **/
public class JoinFunctionTest {

    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);

        // 这里表明的是b线程首先启动的。
        b.start();
        a.start();
    }

    public static void main(String[] args) {
        JoinFunctionTest example = new JoinFunctionTest();
        example.test();
    }

}
