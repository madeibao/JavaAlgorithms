package com.basicJava8.www;

/**
 * @ClassName Java9Test
 * @Author：Mayuan
 * @Date 2020/8/6 19:27
 * @Description TODO
 * @Version 1.0
 **/
public class Java9Test {

    public static void main(String[] args) {
        Handler<Integer> intHandler = new Handler<>(1) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler.handle();
        Handler<? extends Number> intHandler1 = new Handler<>(2) {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };
        intHandler1.handle();
        Handler<?> handler = new Handler<>("test") {
            @Override
            public void handle() {
                System.out.println(content);
            }
        };

        handler.handle();
    }
}

abstract class Handler<T> {
    public T content;

    public Handler(T content) {
        this.content = content;
    }

    abstract void handle();

}
