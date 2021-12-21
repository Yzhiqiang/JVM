package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 16:03 2021/12/19
 * @Modified By:
 */
public class StringExer1 {
    public static void main(String[] args) {
        String s = new String("ab");
        s.intern();
        String s2 = "ab";
//        String s = new String("a") + new String("b");
//        String s2 = s.intern();

        System.out.println(s2 == s);
    }
}
