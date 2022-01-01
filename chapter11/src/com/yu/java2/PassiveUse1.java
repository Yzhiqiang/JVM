package com.yu.java2;

import org.junit.Test;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:12 2022/1/1
 * @Modified By:
 */
public class PassiveUse1 {
    @Test
    public void test() {
        System.out.println(Child.value);
    }

}
interface behavior {
    public int num = 1;
}
class A implements behavior{

}
class Parent{
    static {
        System.out.println("parent的初始化过程");
    }
    public static int num = 1;

}
class Child extends Parent {
    static {
        System.out.println("child的初始化过程");
    }
    public static int value = 2;
}
