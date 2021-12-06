package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 12:10 2021/12/6
 * @Modified By:
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader  systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);


        //获取其上层，扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();   //获取其上层
        System.out.println(extClassLoader);


        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
    }
}
