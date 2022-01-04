package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:19 2022/1/2
 * @Modified By:
 */
public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader classLoader = new MyClassLoader("d:/");
        try {
            classLoader.loadClass("Demo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
