package com.yu.java2;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 17:15 2021/12/19
 * @Modified By:
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String.valueOf(i).intern();
        }
    }
}
