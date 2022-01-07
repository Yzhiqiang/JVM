package com.yu.java2;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 15:37 2022/1/7
 * @Modified By:
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println(initialMemory * 16);
        System.out.println(maxMemory);

        System.out.println(maxMemory * 4 / 1024 + "G");
        System.out.println(initialMemory * 64 / 1024 + "G");
    }
}
