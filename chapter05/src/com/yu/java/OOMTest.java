package com.yu.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:30 2021/12/11
 * @Modified By:
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<Picture>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }

}
class Picture {
    private byte[] pixels;
    public Picture(int length) {
        this.pixels = new byte[length];
    }
}