package com.matrix.www;

/**
 * @ClassName FindValue
 * @Author：Mayuan
 * @Date 2021/6/3/0003 20:24
 * @Description TODO
 * @Version 1.0
 *
 *
 * 矩阵中查找一个值
 *
 *
 **/
public class FindValue {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix==null||matrix.length==0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int i =0, j = n-1;
        while(i<m&&j>=0) {
            if(matrix[i][j]>target) {
                j--;
            }
            else if(matrix[i][j]<target){
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},
        };

        int val = 5;
        System.out.println(findNumberIn2DArray(matrix, val));
    }
}
