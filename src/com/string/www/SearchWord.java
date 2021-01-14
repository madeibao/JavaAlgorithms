package com.string.www;

/**
 * @ClassName SearchWord
 * @Author：Mayuan
 * @Date 2020/9/27 9:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 单词的搜索的值
 **/
public class SearchWord {
    int row = 0;
    int col = 0;
    int targetLength = 0;

    public boolean exist(char[][] board, String word) {
        if (board == null) {
            return false;
        }

        row = board.length;
        col = board[0].length;
        boolean[][] isVisted = new boolean[row][col];
        targetLength = word.length();
        char[] chars = word.toCharArray();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(0, i, j, isVisted, chars, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int index, int i, int j, boolean[][] isVisted, char[] chars, char[][] board) {
        // 拼接字符串所需当前字符 和 遍历到的字符 不同，放弃本次递归
        if (chars[index] != board[i][j]) {
            return false;
        }
        // 拼接字符串所需当前字符 和 遍历到的字符 相同，并且 已经遍历到了 字符串最后一个元素
        if (index == targetLength - 1) {
            return true;
        }

        // 将 当前空间标记为 “已使用”，防止 本次递归中 “重复使用”
        isVisted[i][j] = true;
        /*
            向下遍历
         */
        if (i + 1 < row && !isVisted[i + 1][j] && dfs(index + 1, i + 1, j, isVisted, chars, board)) {
            return true;
        }
        /*
            向右遍历
         */
        if (j + 1 < col && !isVisted[i][j + 1] && dfs(index + 1, i, j + 1, isVisted, chars, board)) {
            return true;
        }
        /*
            向上遍历
         */
        if (i - 1 >= 0 && !isVisted[i - 1][j] && dfs(index + 1, i - 1, j, isVisted, chars, board)) {
            return true;
        }
        /*
            向左遍历
         */
        if (j - 1 >= 0 && !isVisted[i][j - 1] && dfs(index + 1, i, j - 1, isVisted, chars, board)) {
            return true;
        }
        // 将 当前空间标记为 “未使用”，供其它递归使用
        isVisted[i][j] = false;
        return false;
    }


    public static void main(String[] args) {
        char[][] list2 = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},};

        String str2 = "SEE";
        System.out.println(new SearchWord().exist(list2, str2));

    }
}
