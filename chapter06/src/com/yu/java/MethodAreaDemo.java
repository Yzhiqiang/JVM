package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:36 2021/12/12
 * @Modified By:
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start。。。。。。");
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end。。。。。。");
    }
}
