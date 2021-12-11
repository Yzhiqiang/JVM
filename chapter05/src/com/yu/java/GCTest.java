package com.yu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 15:18 2021/12/11
 * @Modified By:
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        String str = "yu";
        try {
            List<String> list = new ArrayList<>();
            while (true) {
                list.add(str);
                str = str + str;
                i++;
            }
        } catch(Throwable t) {
            t.printStackTrace();
            System.out.println("遍历的次数为："+i);
        }

    }
}
