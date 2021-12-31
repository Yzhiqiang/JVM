package com.yu.java2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 22:12 2021/12/31
 * @Modified By:
 */
public class LoadingTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String");
            Method[] ms = clazz.getDeclaredMethods();   //获取该类的所有方法
            for (Method m : ms) {
                String mod = Modifier.toString(m.getModifiers());   //获取方法的修饰符
                System.out.print(mod + " ");

                String returnType = m.getReturnType().getSimpleName();   //获取方法的返回值类型
                System.out.print(returnType + " ");

                System.out.print(m.getName() + "(");
                Class<?>[] ps = m.getParameterTypes();
                if(ps.length == 0) System.out.print(")");
                for (int i = 0; i < ps.length; i++) {
                    char end = (i == ps.length - 1 ? ')' : ',');
                    System.out.print(ps[i].getSimpleName() + end);
                }
                System.out.println(  );
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
