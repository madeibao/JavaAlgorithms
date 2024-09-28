package com.binarysearch.www;

/**
 * @ClassName GetFrequencies
 * @Author：Mayuan
 * @Date 2024/9/28/星期六 21:37
 * @Description TODO
 * @Version 1.0
 **/
public class GetFrequencies {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int len = queries.length;
        int len2 = words.length;

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            int fre = frequency(queries[i]);
            for (int j = 0; j < len2; j++) {
                int temp = frequency(words[j]);
                if (temp > fre) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    private int frequency(String str) {
        int cnt = 1;
        char c = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                cnt++;
            } else if (str.charAt(i) < c) {
                c = str.charAt(i);
                cnt = 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        String[] queries = {"bbb","cc"};
        String[] words = {"a", "aa", "aaa", "aaaa"};

        int[] res = new GetFrequencies().numSmallerByFrequency(queries, words);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
