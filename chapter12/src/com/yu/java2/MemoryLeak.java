package com.yu.java2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 10:25 2022/1/5
 * @Modified By:
 */
public class MemoryLeak {
    static List list = new ArrayList<>();

    public void oomTest() {
        Object obj = new Object();
        list.add(obj);
    }

}
