package com.yu.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:08 2021/12/18
 * @Modified By:
 */
public class StringTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader("word.txt"));
        long start = System.currentTimeMillis();
        String data;
        while((data = bufferedReader.readLine()) != null) {
            data.intern();    //如果字符串常量池中没有对应data的字符串的话，则在字符串常量池中生成。
        }
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为："+(end - start)+" ms");
    }
}
