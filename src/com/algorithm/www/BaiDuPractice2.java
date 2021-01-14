package com.algorithm.www;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName BaiDuPractice2
 * @Author：Mayuan
 * @Date 2020/5/29 20:37
 * @Description TODO
 * @Version 1.0
 * <p>
 * 百度实习2的题目
 * 寻找三角形
 * <p>
 * 5
 * R 0 0 0
 * R 0 4 0
 * R 0 0 3
 * G 92 14 7
 * G 12 16 8
 **/

public class BaiDuPractice2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            sc.nextLine();
            String[] p = new String[N];
            for (int i = 0; i < N; i++) {
                p[i] = sc.nextLine();
            }
            Point[] a = new Point[N];
            for (int i = 0; i < N; i++) {
                String[] temp = p[i].split(" ");
                a[i] = new Point(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
            }
            List<Point> list = new ArrayList();
            List<List<Point>> result = new ArrayList();
            backTracking(a, 0, 3, list, result);
            List<List<Point>> readList = new ArrayList();
            double max = 0.0;
            for (int i = 0; i < result.size(); i++) {
                List<Point> temp1 = result.get(i);
                if (temp1.get(0).c.equals(temp1.get(1).c) && temp1.get(0).c.equals(temp1.get(2).c) || (!temp1.get(0).c.equals(temp1.get(1).c) && (!temp1.get(0).c.equals(temp1.get(2).c)) && (!temp1.get(1).c.equals(temp1.get(2).c)))) {
                    readList.add(temp1);
                }
            }
            for (int i = 0; i < readList.size(); i++) {
                List<Point> temp = readList.get(i);
                double area = getArea(temp);
                if (area > max) {
                    max = area;
                }
            }
            DecimalFormat f = new DecimalFormat("0.00000");
            String format = f.format(max);
            System.out.println(format);


        }


    }

    public static double getArea(List<Point> list) {
        Point a = list.get(0);
        Point b = list.get(1);
        Point c = list.get(2);
        double disab = Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z));
        double disbc = Math.sqrt((b.x - c.x) * (b.x - c.x) + (b.y - c.y) * (b.y - c.y) + (b.z - c.z) * (b.z - c.z));
        double disac = Math.sqrt((a.x - c.x) * (a.x - c.x) + (a.y - c.y) * (a.y - c.y) + (a.z - c.z) * (a.z - c.z));
        double s = 0.5 * (disab + disbc + disac);
        double area = Math.sqrt(s * (s - disab) * (s - disbc) * (s - disac));
        return area;

    }

    public static void backTracking(Point[] a, int start, int k, List<Point> tempList, List<List<Point>> result) {

        if (k < 0) {
            return;
        } else if (k == 0) {
            result.add(new ArrayList<Point>(tempList));
        } else {
            for (int i = start; i < a.length; i++) {
                tempList.add(a[i]);
                backTracking(a, i + 1, k - 1, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }


}

class Point {
    public String c;
    public int x;
    public int y;
    public int z;

    public Point(String c, int x, int y, int z) {
        this.c = c;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}