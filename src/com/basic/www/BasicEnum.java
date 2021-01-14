package com.basic.www;

/**
 * @program: JavaWorkSpace2->BasicEnum
 * @description: Java的枚举类型判断
 * @author: MaYuan
 * @create: 2020-02-09 17:14
 * @version: 1.0
 * 1、枚举的本质是类，在没有枚举之前，仍然可以按照java最基本的编程手段来解决需要用到枚举的地方。
 * 枚举屏蔽了枚举值的类型信息，不像在用public static final定义变量必须指定类型。
 * 枚举是用来构建常量数据结构的模板，这个模板可扩展。
 * 枚举的使用增强了程序的健壮性，比如在引用一个不存在的枚举值的时候，编译器会报错。
 * 枚举的更多用法还需要在开发中去研究创造，Java5、Java6增加了不少新的特性，技术在升级，对程序员来说就要学习，
 * 如果你热爱java的话。否则别人用到新特性的代码你看不懂，那才叫郁闷。
 * <p>
 * 2、枚举在Java家族中只占了很小的一块比重，所以我在项目中用枚举的地方不是很多，
 * 毕竟，一个项目是很多人开发维护的，用一个陌生的东西，会给其他的同事造成阅读困难。
 * 所以常量大都是用public static final 来定义的。
 **/

public class BasicEnum {
    public static void main(String[] args) {
        System.out.println(isRed(Color.GREEN));
        System.out.println(isRed(Color.RED));
    }

    static boolean isRed(Color color) {
        if (Color.RED.equals(color)) {
            return true;
        }
        return false;
    }
}
