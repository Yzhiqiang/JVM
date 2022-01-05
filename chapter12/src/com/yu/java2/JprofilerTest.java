package com.yu.java2;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:05 2022/1/5
 * @Modified By:
 */
public class JprofilerTest {
    public static void main(String[] args) {
        while (true) {
            ArrayList list = new ArrayList();
            for (int i = 0; i < 500; i++) {
                Bean data = new Bean();
                data.list.add(new byte[1024 * 10]);
                list.add(data);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Bean {
    int size = 10;
    String info = "hello, atguigu";
    static ArrayList list = new ArrayList();
}