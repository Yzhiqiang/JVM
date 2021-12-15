package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 14:02 2021/12/15
 * @Modified By:
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Calculate(1000000);
        long end = System.currentTimeMillis();
        System.out.println("花费时间为："+(end - start));

    }
    public static void Calculate(int count) {
        for(int i = 0; i < count; i++) {
            label:for(int j = 2; j < 100; j++) {
                for(int k = 2; k < Math.sqrt(j); k++) {
                    if(j %k == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}
