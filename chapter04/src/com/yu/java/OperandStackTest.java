package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:06 2021/12/8
 * @Modified By:
 */
public class OperandStackTest {
    public void testAddOperation() {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }
    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }
    public void testGetSum() {
        //获取上一个栈帧中的返回值结果，并保存在操作数栈中
        getSum();
        int j = 10;
    }

    public void add() {
        //第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;
        //第二类问题
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

    }
}
