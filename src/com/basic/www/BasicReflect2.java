package com.basic.www;

/**
 * @ClassName BasicReflect2
 * @Author：Mayuan
 * @Date 2021/4/30/0030 10:28
 * @Description TODO
 * @Version 1.0
 *
 * 基本的泛型方法2
 *
 **/

public class BasicReflect2 {

    /**
     /**
     * main (这里用一句话描述这个方法的作用)
     * @param args
     * void
     * @ModifiedPerson Administrator
     * @date 2017年6月2日 下午5:09:38
     */
    public static void main(String[] args) {

        //普通写法，使用New 关键字
        ITest iTest = createITest("ITestImpl1");
        iTest.testReflect();
        ITest iTest2 = createITest("ITestImpl2");
        iTest2.testReflect();

    }

    /**
     * createITest 普通写法，使用New关键字，但是假设有1000个不同ITest需要创建,那你打算写1000个 if语句来返回不同的ITest对象?
     * @param name
     * @return
     * ITest
     * @ModifiedPerson Administrator
     * @date 2017年6月2日 下午5:32:21
     */
    public static ITest createITest(String name){

        if (name.equals("ITestImpl1")) {
            return new ITestImpl1();
        } else if(name.equals("ITestImpl2")){
            return new ITestImpl2();
        }

        return null;
    }
}


interface ITest{
    void testReflect();
}

class ITestImpl1 implements ITest{

    /**
     * (non-Javadoc)
     * <p>Title: test</p>
     * <p>Description: </p>
     * @see ITest#test()
     */
    @Override
    public void testReflect() {

        System.out.println("I am ITestImpl1 !");
    }
}

class ITestImpl2 implements ITest{

    /**
     * (non-Javadoc)
     * <p>Title: testReflect</p>
     * <p>Description: </p>
     * @see ITest#testReflect()
     */
    @Override
    public void testReflect() {

        System.out.println("I am ITestImpl2 !");
    }

}


