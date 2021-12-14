package com.yu.java;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 17:03 2021/12/14
 * @Modified By:
 */
public class Customer {
    int id = 1001;
    String name;
    Account acct;
    {
        name = "匿名用户";
    }
    public Customer() {
        acct = new Account();
    }
}
class Account {

}
