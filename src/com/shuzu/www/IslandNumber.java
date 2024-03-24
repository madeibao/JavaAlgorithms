package com.shuzu.www;

/**
 * @ClassName IslandNumber
 * @Author：Mayuan
 * @Date 2021/3/24/0024 15:50
 * @Description TODO
 * @Version 1.0
 *
 * 岛屿数量。
 * leetcode 200
 *
 **/
public class IslandNumber {
    public int solve (char[][] grid) {
        // write code here

        // 表示行
        int m = grid.length;

        // 表示列。
        int n = grid[0].length;
        int count =0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                // 假定的是当前仍然是陆地，则可以继续的遍历上下左右的内容。
                if(grid[i][j]=='1') {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int i,int j) {

        // 遍历到边框的位置上，则进行下一步。
        // 或者是遍历到的位置上为0，默认是海洋，返回。
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }

    public static void main(String[] args) {

        char[][] num =  {{'1','1','0','0','0'},
                         {'0','1','0','1','1'},
                         {'0','0','0','1','1'},
                         {'0','0','0','0','0'},
                         {'0','0','1','1','1'}};

        char[][] ch = {{'0','1','0'},
                {'1','0','0'},
                {'1','0','0'}};
        IslandNumber test = new IslandNumber();
        System.out.println(test.solve(num));
        System.out.println(test.solve(ch));
    }
}


