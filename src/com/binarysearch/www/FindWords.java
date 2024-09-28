package com.binarysearch.www;

/**
 * 寻找单词
 *
 * @ClassName FindWords
 * @Author：Mayuan
 * @Date 2024/9/28/星期六 18:09
 * @Description TODO
 * @Version 1.0
 **/
public class FindWords {
    public static char nextGreatestLetter(char[] letters, char target) {

        int left = 0, right = letters.length - 1;
        int i = left, j = right;
        while (i < j) {
            int temp = i + (j - i) / 2;
            if (letters[temp] > target) {
                j = temp;
            } else {
                i = temp + 1;
            }
        }
        return letters[i] > target ? letters[i] : letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h'};
        char target = 'd';
        System.out.print(nextGreatestLetter(letters, target));
    }
}
