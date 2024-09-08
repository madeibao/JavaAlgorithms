package com.basicexception.www;

/**
 * @ClassName TryTest
 * @Author：Mayuan
 * @Date 2021/4/29/0029 20:22
 * @Description TODO
 * @Version 1.0
 *
 * 捕获异常的案例方法
其实，我们通过以上例子我们可以发现，不管return关键字在哪，finally一定会执行完毕。
理论上来说try、catch、finally块中都允许书写return关键字，
但是执行优先级较低的块中的return关键字定义的返回值将覆盖执行优先级较高的块中return关键字定义的返回值。
也就是说finally块中定义的返回值将会覆盖catch块、try块中定义的返回值；
catch块中定义的返回值将会覆盖try块中定义的返回值。
再换句话说如果在finally块中通过return关键字定义了返回值，
那么之前所有通过return关键字定义的返回值都将失效——因为finally块中的代码一定是会执行的。

 **/
public class TryTest {

    public static void main(String[] args) {
        System.out.println(handleException4());
    }

    /**
     * 情况3：try和finally中均有return
     *
     * @return
     */
    private static String handleException4() {
        try {
            System.out.println("");
            return "try块的返回值";
        } catch (Exception e) {
            System.out.println("捕获到了异常");
        } finally {
            System.out.println("finally块执行完毕了");
            return "finally的返回值";
        }
        //  return "最终的结果";//不能再有返回值
    }
}
