package com.string.www;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * @ClassName EvalTest
 * @Author：Mayuan
 * @Date 2020/6/1 22:21
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java调用脚本语言来进行分析逻辑。
 * 三、逻辑计算
 * <p>
 * 题目描述：
 * <p>
 * 常用的逻辑计算有And（表示为&）；Or（表示为|）；Not（表示为！）。其中，他们的优先级关系是Not（！）>And（&）>Or（|）。
 * <p>
 * 输入描述：
 * <p>
 * 1、测试用例中间无空格，无需考虑空格。
 * <p>
 * 2、测试用例表达式只会出现如下字符：“0”，“1”，“（”，“）”，“&”，“|”，“！”。
 * <p>
 * 3、测试用例所给的输入都是合法输入，无需要考虑非法输入。
 * <p>
 * 4、测试用例长度不会超过128个字符。
 * <p>
 * 5、括号可以重复嵌套。
 * <p>
 * 例如：
 * <p>
 * 1 | ( 1 & 0 )                       返回值：1
 * <p>
 * 1 & 0 | 0 & 1                       返回值：0
 * <p>
 * ! 0 & 1 | 0                          返回值：1
 * <p>
 * ( ( ! 0 & 1 ) ) | 0                 返回值：1
 * <p>
 * 输出描述：
 * <p>
 * 输出逻辑运算后的最终结果：0或者1
 * <p>
 * 示例1：
 * 输入：! ( 1 & 0 ) | 0 & 1
 * <p>
 * 输出：1
 * <p>
 * 示例2：
 * 输入：! ( 1 & 0 ) & 0 | 0
 * <p>
 * 输出：0
 * 第一种解法：调用函数
 **/
public class EvalTest {
    public static void piPei(String s) {

        ScriptEngineManager manager = new ScriptEngineManager();
        // 加载javaScript操作引擎。
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            System.out.println(engine.eval(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        piPei("1&0|0&1");
    }

}