package com.yu.java2;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 9:38 2021/12/21
 * @Modified By:
 */
public class CanReliveObj {
    private static Object obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize（）方法");
        obj = this;
    }

    public static void main(String[] args) {

        try {
            obj = new CanReliveObj();
            obj = null;
            System.gc();
            System.out.println("第1次 gc");
            Thread.sleep(2000);
            if(obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("Obj is still alive");
            }
            obj = null;
            System.gc();
            System.out.println("第2次 gc");
            Thread.sleep(2000);
            if(obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("Obj is still alive");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
