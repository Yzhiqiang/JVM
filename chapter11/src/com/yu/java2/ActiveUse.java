package com.yu.java2;

import org.junit.Test;

import java.io.*;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 15:03 2022/1/1
 * @Modified By:
 */
public class ActiveUse {
    public static void main(String[] args) {
        new Thread() {
            {
                System.out.println("###############牛逼呀");
            }
        };
    }
    @Test
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("order.dat"));
            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null) oos.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("order.dat"));
            Order order = (Order)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test3() {
        Order.method();
    }

    @Test
    public void test4() {
        try {
            Class clazz = Class.forName("com.yu.java2.Order");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Order implements Serializable{
    static {
        System.out.println("Order 类的初始化过程");
    }
    public static void method() {
        System.out.println("Method 静态方法");
    }

}
