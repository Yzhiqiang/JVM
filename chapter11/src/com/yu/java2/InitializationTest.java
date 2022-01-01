package com.yu.java2;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:24 2022/1/1
 * @Modified By:
 */
public class InitializationTest {
    public int num = 1;
    public static int num1;   //静态字段没有显示赋值，也不会生成clinit方法

    public static int num2 = 2;
}
