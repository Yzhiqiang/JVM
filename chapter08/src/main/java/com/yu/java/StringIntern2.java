package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 16:45 2021/12/19
 * @Modified By:
 */
public class StringIntern2 {
    static final int MAX_COUNT = 1000 * 10000;
    static final String[] arr = new String[MAX_COUNT];
    public static void main(String[] args) {
        Integer[] data = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
//            arr[i] = new String(String.valueOf(data[i % data.length]));
            arr[i] = new String(String.valueOf(data[i % data.length])).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
