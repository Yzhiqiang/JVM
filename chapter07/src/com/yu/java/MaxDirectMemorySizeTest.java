package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:51 2021/12/14
 * @Modified By:
 */
public class MaxDirectMemorySizeTest {
    private static final int _1MB = 1024 * 1024;
    public static void main(String[] args) {
        byte[] allo1, allo2, allo3;
//        allo1 = new byte[2 * _1MB];
//        allo2 = new byte[2 * _1MB];
        allo3 = new byte[4 * _1MB];
    }
}
