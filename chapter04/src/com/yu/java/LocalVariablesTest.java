package com.yu.java;

import java.util.Date;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 17:30 2021/12/7
 * @Modified By:
 */
public class LocalVariablesTest {
    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 1;
        test.test1();
    }
    //练习：
    public static void testStatic() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;

        {
            int k = 0;
        }
        System.out.println(count);
    }
    public void test1() {
        Date date = new Date();
        String name = "atguigu.com";
        String info = test2(date, name);
        System.out.println(date + name);
    }

    public String test2(Date datep, String name) {
        datep = null;
        name = "songhongkang";
        double weight = 130.5;
        char gender = '男';
        return datep + name;
    }
    public void test3() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        int c = a + 1;   //变量c使用之前已经销毁了b的slot位置
    }

    //局部变量：在使用前必须要进行显式赋值，否则，编译不通过。
    public void test4() {
        int a ;
        //System.out.println(a);    没有初始化
    }
}
