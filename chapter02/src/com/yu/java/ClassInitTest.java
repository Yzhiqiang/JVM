package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:20 2021/12/6
 * @Modified By:
 */
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;   //在程序链接时就会为其中的变量赋值为默认值， 0
    }

    private static int number = 10;



    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(number);
    }
}
