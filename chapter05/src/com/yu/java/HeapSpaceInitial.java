package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:38 2021/12/10
 * @Modified By:
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        //返回堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        //返回Java虚拟机试图使用的最大堆内存量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;;

        System.out.println("-Xms:"+initialMemory);
        System.out.println("-Xmx:"+maxMemory);

    }
}
