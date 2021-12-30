package com.yu.java;

import org.junit.Test;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 18:51 2021/12/29
 * @Modified By:
 */
public class ArithmeticTest {
    @Test
    public void method1() {
        int i = 10;
        double  j = i / 0.0;
        System.out.println(j);

        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2);
    }
    public void method2() {
        float i = 10;
        float j = -i;
        i = -j;
    }
    public void method3(int j) {
        int i = 100;
        i++;
    }

    public void method4(byte ch) {
        short a = ch;
    }
}
