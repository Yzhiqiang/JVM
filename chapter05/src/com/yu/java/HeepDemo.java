package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:22 2021/12/10
 * @Modified By:
 */
public class HeepDemo {
    public static void main(String[] args) {
        System.out.println("start......");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end.....");
    }
}
