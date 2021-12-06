package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:43 2021/12/6
 * @Modified By:
 */
public class ClinitExtendTest  {
    public static void main(String[] args) {
        Runnable r = ()-> {
            while(true) {
                System.out.println(Thread.currentThread().getName()+"开始");
                DeadThread deadThread = new DeadThread();
                System.out.println(Thread.currentThread().getName()+"结束");
                DeadThread deadThread1 = new DeadThread();
            }
        };

        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");

        t1.start();
        t2.start();
    }
}

class DeadThread {
    static{
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}