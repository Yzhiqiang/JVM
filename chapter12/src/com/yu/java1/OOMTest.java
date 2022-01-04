package com.yu.java1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 16:03 2022/1/4
 * @Modified By:
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while(true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(100 * 50)));
        }
    }
}
class Picture {
    private byte[] pixels;
    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
