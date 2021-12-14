package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:53 2021/12/14
 * @Modified By:
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspace=300m -XX:+PrintGCDetails
 */
public class StaticFieldTest {
    private static byte[] arr = new byte[1024 * 1024 * 100];

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
