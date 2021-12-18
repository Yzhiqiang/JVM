package com.yu.java;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:59 2021/12/18
 * @Modified By:
 */
public class GenerateString {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("word.txt");

        for (int i = 0; i < 100000; i++) {
            int length = (int) (Math.random() * (10 - 1 + 1) + 1);
            file.write(getString(length) + "\n");
        }
        file.close();
    }
    public static String getString(int length) {
        String str = "";
        for (int i = 0; i < length; i++) {
            int num = (int) ((Math.random() * (90 - 65 + 1) + 65) + (int)(Math.random() * 2 + 32));
            str += (char)num;
        }
        return str;
    }
}
