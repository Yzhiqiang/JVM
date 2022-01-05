package com.yu.java2;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 12:02 2022/1/5
 * @Modified By:
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //        return elements[--size];    //此处只是将size指针移动，但是对象的引用还在，会引发过期引用

        Object res = elements[--size];
        elements[size] = null;
        return res;
    }
    public void ensureCapacity () {
        if(size == DEFAULT_INITIAL_CAPACITY)
            elements = Arrays.copyOf(elements, 2 * DEFAULT_INITIAL_CAPACITY + 1);
    }
}
