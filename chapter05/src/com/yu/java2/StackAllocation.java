package com.yu.java2;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:45 2021/12/11
 * @Modified By:
 * -Xms1G -Xmx1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end - start) + "ms");
    }

    private static void alloc() {
        User user = new User();
    }
    static class User {

    }
}
