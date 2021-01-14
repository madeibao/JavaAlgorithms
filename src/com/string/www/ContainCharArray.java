package com.string.www;

/**
 * @ClassName ContainCharArray
 * @Author：Mayuan
 * @Date 2020/4/29 17:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * 是否包含有字符串中的所有的字符
 * <p>
 * 题目描述
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
 * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 例如 \begin{bmatrix} a & b & c &e \\ s & f & c & s \\ a & d & e& e\\ \end{bmatrix}\quad
 * ⎣
 * ⎡
 * a
 * s
 * a
 * b
 * f
 * d
 * ​
 * <p>
 * c
 * c
 * e
 * ​
 * <p>
 * e
 * s
 * e
 * ​
 * <p>
 * ⎦
 * ⎤
 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子
 **/
public class ContainCharArray {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int flag[] = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
            return false;
        if (k == str.length - 1) return true;
        flag[index] = 1;
        if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || helper(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        flag[index] = 0;
        return false;
    }

    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c', 'e',
                's', 'f', 'c', 's',
                'a', 'd', 'e', 'e'};
        int col = 4, row = 3;
        char[] ch2 = {'b', 'c', 'c', 'e', 'd'};
        System.out.println(hasPath(chs, row, col, ch2));
    }
}
