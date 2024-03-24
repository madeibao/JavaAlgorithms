package com.designpattern.www.iterator.singleinstance;

/**
 * @ClassName Singleton4
 * @Author：Mayuan
 * @Date 2020/10/16 21:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 双重校验所的模式来实现
 **/
public class Singleton4 {

    //  volatile 应该是进制置零的重排序。
    /**
     *
     * volatile用来进制指令的重新排序。
     还有，这里的private static volatile Singleton singleton = null;中的volatile也必不可少，volatile关键字可以防止jvm指令重排优化，

     因为 singleton = new Singleton() 这句话可以分为三步：
     1. 为 singleton 分配内存空间；
     2. 初始化 singleton；
     3. 将 singleton 指向分配的内存空间。
     但是由于JVM具有指令重排的特性，执行顺序有可能变成 1-3-2。 指令重排在单线程下不会出现问题，
     但是在多线程下会导致一个线程获得一个未初始化的实例。例如：线程T1执行了1和3，
     此时T2调用 getInstance() 后发现 singleton 不为空，因此返回 singleton， 但是此时的 singleton 还没有被初始化。
     使用 volatile 会禁止JVM指令重排，从而保证在多线程下也能正常执行。
     */

    /**
     * volatile是为了防止指令的重排序的操作。
     */
    private volatile static Singleton4 singleton;

    private Singleton4() {}

    public static Singleton4 getSingleton4() {

        // 第一次来进行校验锁的结构
        if (singleton == null) {
            synchronized (Singleton4.class) {
                // 第二次来进行校验锁的结构。
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }

    public void showMessage() {
        System.out.println("show message");
    }

    public static void main(String[] args) {
        Singleton4 single = Singleton4.getSingleton4();
        single.showMessage();
    }
}
