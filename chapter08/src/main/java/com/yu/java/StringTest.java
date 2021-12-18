package com.yu.java;

import org.junit.Test;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:30 2021/12/18
 * @Modified By:
 */
public class StringTest {
    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1.hashCode() == s2.hashCode());
    }

    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";

        s1 = s1 + "hello";
        System.out.println(s2);
    }

    @Test
    public void test03() {
        String s1 = "abc";
        String s2 = "abc";

        s1.replace("a", "b");

        System.out.println(s1);
    }
}
