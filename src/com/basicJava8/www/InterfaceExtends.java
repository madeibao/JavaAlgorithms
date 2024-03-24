package com.basicJava8.www;

/**
 * @ClassName InterfaceExtends
 * @Author：Mayuan
 * @Date 2020/7/2 16:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 接口的继承结果值。
 * 使用Java8开发应用程序，子类实现多个接口时，对于接口默认方法定义可能会出现多个默认方法，并且接口默认方法可能会出现同名情况，此时对于子类在实现或者调用时通常遵循以下原则:
 * <p>
 * 1.类中的方法优先级最高
 * <p>
 * 2.如果第一条无法进行判断,那么子接口的优先级更高:函数签名相同时,优先选择拥有最具体实现的默认方法的接口,即如果B继承了A,那么B就比A更加具体
 * <p>
 * 作者：乐字节
 * 链接：https://segmentfault.com/a/1190000018732693
 * 来源：SegmentFault 思否
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/

/**
 * 定义手机接口  提供默认info方法
 */
interface Phone {
    default void info() {
        System.out.println("这是一部手机");
    }
}


/**
 * 定义MiPhone子接口 并继承 Phone 父接口 同时也提供info方法
 */
interface MiPhone extends Phone {
    default void info() {
        System.out.println("这是一部小米手机");
    }
}


/**
 * 实现 Phone MiPhone 接口
 */
public class InterfaceExtends implements Phone, MiPhone {

    public static void main(String[] args) {
        new InterfaceExtends().info();
    }
}
