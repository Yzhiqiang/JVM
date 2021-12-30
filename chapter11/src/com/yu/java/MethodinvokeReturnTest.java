package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:49 2021/12/30
 * @Modified By:
 */
public class MethodinvokeReturnTest {
    public static void main(String[] args) {
        MethodinvokeReturnTest method = new MethodinvokeReturnTest();
        method.returnString();
    }
    public String returnString() {
        return "hello world";
    }
}
