package com.yu.java;

import org.junit.Test;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 9:57 2021/12/19
 * @Modified By:
 */
public class MyStringTest {
    private String name = "1111";
    private int age = 11;
    public static void main(String[] args) throws InterruptedException {
        String s = new String("1") + new String("1");
        s.intern();
        String str = "11";
        System.out.println(s == str);
    }

    @Test
    public void test() {
        String s = new String("1") + new String("1");
        s.intern();
        String str = "11";
        System.out.println(s == str);
    }

}
