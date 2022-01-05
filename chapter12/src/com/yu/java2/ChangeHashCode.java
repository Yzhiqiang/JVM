package com.yu.java2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 11:34 2022/1/5
 * @Modified By:
 */
public class ChangeHashCode {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        set.add(p1);
        set.add(p2);
        p1.name = "CC";    //修改了参与计算哈希值的字段， 导致了内存泄露
        set.remove(p1);    //删除失败
        System.out.println(set);
    }
}

class Person {
    public int id;
    public String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Person)) return false;

        Person person = (Person) obj;
        if(id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}