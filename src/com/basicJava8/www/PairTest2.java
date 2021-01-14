package com.basicJava8.www;

/**
 * @ClassName PairTest2
 * @Author：Mayuan
 * @Date 2020/6/16 16:28
 * @Description TODO
 * @Version 1.0
 **/

class Pair<T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        String min = arr[0];
        String max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
            }
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
        return new Pair<>(min, max);
    }
}


public class PairTest2 {
    public static void main(String[] args) {
        String[] words = {"marry", "had", "a", "little", "lamb"};

        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

