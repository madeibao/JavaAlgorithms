package com.java17.www;

/**
 *
 * @ClassName Fruit
 * @Author Mayuan
 * @Date 2026/7/2/星期四 19:54
 * @Version 1.0
 **/
public sealed class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    final static class Apple extends Fruit {
        String name;

        public Apple(String name) {
            super(name);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    final static class Banana extends Fruit {
        String name;

        public Banana(String name) {
            super(name);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple("苹果");
        Banana banana = new Banana("香蕉");
        System.out.println(apple.getName());
        System.out.println(banana.getName());
    }
}
