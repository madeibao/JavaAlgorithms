package com.dfs.www;

/**
 *
 *  被围绕的区域
 *
 * @ClassName SurroundArea
 * @Author Mayuan
 * @Date 2026/7/2/星期四 11:08
 * @Version 1.0
 **/
public class SurroundArea {
    public void solve(char[][] board) {

        // 行和列
        int m = board.length;
        int n = board[0].length;
        if (m < 3 || n < 3) {
            return;
        }
        // 处理行和列
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            dfs(board, 0, j);
            dfs(board, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }
        if (board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };
        new SurroundArea().solve(board);
        for (char[] ch : board) {
            for (char c : ch) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
