package com.yu.java1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 9:47 2022/1/4
 * @Modified By:
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 100)];    //随机定义一个大小在100k以内的字节数组

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<HeapInstanceTest> list = new ArrayList<>();

        while(true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
