package com.yu.java3;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:32 2022/1/2
 * @Modified By:
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        String[] arrStr = new String[10];
        System.out.println(arrStr.getClass().getClassLoader());    //引导类加载器

        int[] values = new int[10];
        System.out.println(values.getClass().getClassLoader());    //null， 不是引导类加载器， 因为基本类型虚拟机预先定义了，不需要加载。
    }
}
