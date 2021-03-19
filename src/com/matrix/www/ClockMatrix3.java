package com.matrix.www;

/**
 * @ClassName ClockMatrix3
 * @Author：Mayuan
 * @Date 2021/1/14/0014 22:10
 * @Description TODO
 * @Version 1.0
 **/
public class ClockMatrix3 {
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0) {
            return new int[0];
        }

        // 结果列表值。
        int[] res = new int[matrix.length*matrix[0].length];
        int count=0,l=0,t=0,r=matrix[0].length-1,b=matrix.length-1;
        while(true){
            for(int i=l;i<=r;i++) res[count++] = matrix[t][i];
            if(++t>b) break;
            for(int i=t;i<=b;i++) res[count++] = matrix[i][r];
            if(--r<l) break;
            for(int i=r;i>=l;i--) res[count++] = matrix[b][i];
            if(--b<t) break;
            for(int i=b;i>=t;i--) res[count++] = matrix[i][l];
            if(++l>r) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[] res = spiralOrder(nums);
        for(int i:res) {
            System.out.print(i+" ");
        }
    }

}
