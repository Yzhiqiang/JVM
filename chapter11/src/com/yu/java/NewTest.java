package com.yu.java;

import org.junit.Test;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 16:02 2021/12/30
 * @Modified By:
 */
public class NewTest {
    public void newArray() {
        int[] intArray = new int[10];
        Object[] objArray = new Object[10];
        int[][] mulArray = new int[10][10];
    }
    public String checkCase(Object obj) {
        if(obj instanceof String) {
            return (String)obj;
        } else {
            return (String)obj;
        }
    }

    public static void main(String[] args) {
        NewTest newTest = new NewTest();
        Integer a = 5;
        System.out.println(newTest.checkCase(a));
    }
}
