package com.yu.java;

import java.util.ArrayList;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:50 2021/12/24
 * @Modified By:
 */
public class test {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            byte[] arr = new byte[1024 * 10];
            list.add(arr);
        }
    }
}
