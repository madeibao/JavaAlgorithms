package com.basic.www;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @ClassName BasicJavaScriptEngine
 * @Author：Mayuan
 * @Date 2020/6/18 10:29
 * @Description TODO
 * @Version 1.0
 * <p>
 * 基本的javascript执行引擎
 **/


public class BasicJavaScriptEngine {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String name = "luyaran";
        Integer result = null;
        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");
        } catch (
                ScriptException e) {
            System.out.println("执行脚本错误  " + e.getMessage());
        }
        System.out.println(result.toString());
    }
}
