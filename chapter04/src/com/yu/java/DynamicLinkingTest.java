package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:22 2021/12/8
 * @Modified By:
 */
class father{
    public void say() {
        System.out.println("加油");
    }
}
class Print extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("hello world");
            Thread.sleep(1000);
        }
    }
}
public class DynamicLinkingTest extends father{
    int num = 10;
    public final void methodA() {
        System.out.println("methodA().....");
    }

    public void methodB() {
        System.out.println("methodB.......");

        methodA();

        super.say();
        num++;
    }

    public static void main(String[] args) {
        Print print = new Print();
        new Thread(print).start();
    }
}

