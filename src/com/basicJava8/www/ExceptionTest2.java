package com.basicJava8.www;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName ExceptionTest2
 * @Author：Mayuan
 * @Date 2020/8/26 10:46
 * @Description TODO
 * @Version 1.0
 **/

public class ExceptionTest2 {
    private static void readFile(String filePath) throws IOException {
        File file = new File(filePath);

        String result;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((result = reader.readLine()) != null) {
            System.out.println(result);
        }

        reader.close();
    }

    public static void main(String[] args) {

    }

}
