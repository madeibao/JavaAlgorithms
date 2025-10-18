package com.abytedance.www;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PageSwap
 * @Author Mayuan
 * @Date 2025/10/18/星期六 20:09
 * @Version 1.0
 **/
public class PageSwap {
    static class PageObj {

        public PageObj(int page, int time, int count) {
            this.page = page;
            this.time = time;
            this.count = count;
        }

        int page;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        int time;
        int count;
    }

    List<Integer> poll(int num, int window, int[] pageList) {
        int n = pageList.length;
        Map<Integer, PageObj> pageFrame = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int pageId = pageList[i];
            if (pageFrame.containsKey(pageId)) {
                PageObj obj = pageFrame.get(pageId);
                obj.setCount(obj.getCount() + 1);
                obj.setTime(i);
            } else {
                if (pageFrame.size() >= num) {
                    int res = find(pageFrame, window);
                    ans.add(res);
                    pageFrame.remove(res);
                }
                pageFrame.put(pageId, new PageObj(pageId, i, 1));
            }
        }
        return ans;
    }

    private int find(Map<Integer, PageObj> pageFrame, int window) {
        ArrayList<PageObj> list = new ArrayList<>(pageFrame.values());
        list.sort(Comparator.comparingInt(PageObj::getTime));
        list.sort(new Comparator<PageObj>() {
            @Override
            public int compare(PageObj o1, PageObj o2) {
                return Integer.compare(o1.getTime(), o2.getTime());
            }
        });

        int target = -1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < Math.min(window, list.size()); i++) {
            PageObj obj = list.get(i);
            int count = obj.getCount();
            if (count < minValue) {
                minValue = count;
                target = obj.getPage();
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int num = 3;
        int window = 2;
        int[] pageList = new int[]{51, 52, 53, 54, 54, 51, 52, 53, 54};
        List<Integer> res = new PageSwap().poll(num, window, pageList);
        res.forEach(System.out::println);
    }
}
