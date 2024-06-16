package com.java17.www;

/**
 * @ClassName JSONTest
 * @Author：Mayuan
 * @Date 2024/6/2/星期日 11:48
 * @Description TODO
 * @Version 1.0
 **/
public class JSONTest {
    public static void main(String[] args) {

        String str = "{\"id\":1,\"name\":\"泉泉\"}";
        System.out.println("普通字符串：" + str);
        String jdk15JsonStr = """
                {
                    "id":1,
                    "name":"泉泉"
                }
                """;
        System.out.println("jdk15字符串加强：" + jdk15JsonStr);
    }
}
