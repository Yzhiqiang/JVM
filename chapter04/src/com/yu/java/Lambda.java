package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:09 2021/12/8
 * @Modified By:
 */
interface Func{
    public boolean func(String str);
}
public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = Impl->{
            System.out.println(Impl);
            return true;
        };
        String str = "BAT";
        str.replace('B', 'A');
        func.func("aaaaaaaaaa");
    }
}
