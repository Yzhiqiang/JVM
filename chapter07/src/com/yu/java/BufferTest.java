package com.yu.java;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 17:45 2021/12/14
 * @Modified By:
 */
public class BufferTest {
    public static void main(String[] args) {
        //直接分配本地内存空间
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        System.out.println("直接内存分配完毕，请求指示？");

        Scanner in = new Scanner(System.in);
        in.next();

        System.out.println("直接内存开始释放？");
        byteBuffer = null;
        System.gc();    //垃圾回收
        in.next();
    }
}
