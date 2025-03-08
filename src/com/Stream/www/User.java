package com.Stream.www;

/**
 * @ClassName User
 * @Author：Mayuan
 * @Date 2025/3/8/星期六 16:43
 * @Description TODO
 * @Version 1.0
 **/
public class User {

    private int id;
    private String name;
    private String phone;

    public User(String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
