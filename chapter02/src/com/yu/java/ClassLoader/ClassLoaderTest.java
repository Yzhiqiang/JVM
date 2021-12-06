package com.yu.java.ClassLoader;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 13:39 2021/12/6
 * @Modified By:
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        try {
            //1.获取类的加载器
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.线程获取类的加载器
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            //3.
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(parent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
