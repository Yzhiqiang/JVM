package com.yu.java;

import java.io.*;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:10 2022/1/2
 * @Modified By:
 * 自定义类的加载器
 */
public class MyClassLoader extends ClassLoader{
    private String byteCodePath;

    public MyClassLoader(String byteCodePath) {
        this.byteCodePath = byteCodePath;
    }

    public MyClassLoader(ClassLoader parent, String byteCodePath) {
        super(parent);
        this.byteCodePath = byteCodePath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String filename = byteCodePath + name + ".class";  //获取字节码文件的完成路径
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream((filename)));   //获取一个输入流
            baos = new ByteArrayOutputStream();    //获取一个输出流

            int len;
            byte[] data = new byte[1024];
            //具体读入数据并写出的过程，将数据写出到内存中的一个字节数组中
            while ((len = bis.read(data)) != -1) {
                baos.write(data, 0, len);
            }
            //获取内存中的完整的字节数组的数据
            byte[] byteCodes = baos.toByteArray();

            //调用defineclass（），将字节数组的数据转换为Class的实例
            defineClass(null, byteCodes, 0, byteCodes.length);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null) baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
