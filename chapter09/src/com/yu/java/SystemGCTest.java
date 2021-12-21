package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:11 2021/12/21
 * @Modified By:
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        Thread.sleep(1);
        System.out.println("调用了该对象的finalization的方法");
    }
}
