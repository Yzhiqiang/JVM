package com.yu.java;

import java.lang.ref.SoftReference;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:46 2021/12/22
 * @Modified By:
 */
public class SoftReferenceTest {
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "[name: " +name + "age: "+age+"]";
        }
    }

    public static void main(String[] args) {
        SoftReference<Person> softReference = new SoftReference<>(new Person("zhangsan", 1));
        System.gc();
        System.out.println(softReference.get());

        try{
            byte[] ch = new byte[1024 * (7168 - 601)];
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(softReference.get());
        }
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
