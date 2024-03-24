package com.basicJava8.www;

/**
 * @ClassName GetName
 * @Author：Mayuan
 * @Date 2020/6/16 8:30
 * @Description TODO
 * @Version 1.0
 **/
public class GetName implements MyInterface {

    public static void main(String[] args) {
        GetName getName = new GetName();
        //可以直接调用接口中的默认方法myOldName（）
        System.out.println("my old name is " + getName.myOldName());
        String newName = "超人";
        getName.myNewName(newName);
    }

    //只需要实现该方法即可；
    public String myNewName(String newName) {
        System.out.println("my new name is " + newName);
        return "my new name is " + newName;
    }

}
