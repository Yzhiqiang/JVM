package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:11 2021/12/27
 * @Modified By:
 */

/**
 * 成员变量赋值过程：
 * ①默认初始化
 * ②显式初始化/代码块中初始化
 * ③构造器初始化
 * ④有了对象后进行赋值
 */
class Father {
    int x = 10;
    public Father() {
        this.print();
        x = 20;
    }
    public void print() {
        System.out.println("Father./x = " + x);
    }
}

class Son extends Father{
    int x = 30;
    public  Son() {
        this.print();
        x = 40;
    }
    public void print() {
        System.out.println("Son.x = " +x);
    }
}
public class SonTest {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);    //属性不存在多态性，方法才有多态性
    }
}
