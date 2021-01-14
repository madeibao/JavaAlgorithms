package com.method.www;

import java.util.Iterator;

/**
 * @program: Pro1->Range
 * @description: Java实现python的遍历的循环
 * @author: MaYuan
 * @create: 2019-12-23 19:33
 * @version: 1.0
 **/
class Range implements Iterable<Integer> {
    private final int start;
    private final int end;
    private final int step;

    public Range(int end) {
        this(0, end, 1);
    }

    public Range(int start, int end) {
        this(start, end, 1);
    }

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Integer> {
        int current = start;

        @Override
        public boolean hasNext() {
            return step > 0 ? current < end : current > end;
        }

        @Override
        public Integer next() {
            int t = current;
            current += step;
            return t;
        }
    }
}