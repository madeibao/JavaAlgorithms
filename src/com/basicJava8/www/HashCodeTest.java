package com.basicJava8.www;

import java.util.HashMap;

/**
 * @ClassName HashCode
 * @Author：Mayuan
 * @Date 2020/11/11 20:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 重写hashcode,一定要重写 equals 方法
 * 重写equals 方法一定要重写hashCode 方法
 **/

class Key {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public Key(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Key)) {
            return false;
        } else {
            return this.getId().equals(((Key) o).getId());
        }
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

/**
 * @author mayuan
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Key k1 = new Key(1);
        Key k2 = new Key(1);
        HashMap<Key, String> hm = new HashMap<Key, String>(3);
        hm.put(k1, "Key with id is 1");
        System.out.println(hm.get(k2));
    }
}
