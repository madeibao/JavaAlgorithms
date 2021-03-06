package com.basic.www;

/**
 * @ClassName InitOrder
 * @Author：Mayuan
 * @Date 2021/4/4/0004 22:12
 * @Description TODO
 * @Version 1.0
 *
 * 类的初始化的顺序


初始化顺序是：

（1） 先是父类的static变量和static初始化块

（2）然后是子类的static变量和static初始化块

（3）父类的实例变量、初始化快

（4）父类的构造方法

（5）子类的实例变量、初始化快

（6）子类构造方法


 **/


class Parent {
    /* 静态变量 */
    public static String p_StaticField = "父类--静态变量";
    /* 变量 */
    public String p_Field = "父类--变量";
    protected int i = 9;
    protected int j = 0;
    /* 静态初始化块 */
    static {
        System.out.println( p_StaticField );
        System.out.println( "父类--静态初始化块" );
    }
    /** 初始化块 */
    {
        System.out.println( p_Field );
        System.out.println( "父类--初始化块" );
    }
    /** 构造器 */
    public Parent()
    {
        System.out.println( "父类--构造器" );
        System.out.println( "i=" + i + ", j=" + j );
        j = 20;
    }
}

public class InitOrder extends Parent {
    /* 静态变量 */
    public static String s_StaticField = "子类--静态变量";
    /* 变量 */
    public String s_Field = "子类--变量";
    /* 静态初始化块 */
    static {
        System.out.println( s_StaticField );
        System.out.println( "子类--静态初始化块" );
    }
    /* 初始化块 */
    {
        System.out.println( s_Field );
        System.out.println( "子类--初始化块" );
    }
    /** 构造器 */
    public InitOrder()
    {
        System.out.println( "子类--构造器" );
        System.out.println( "i=" + i + ",j=" + j );
    }

    /** 程序入口 */
    public static void main( String[] args )
    {
        System.out.println( "子类main方法" );
        new InitOrder();
    }
}
