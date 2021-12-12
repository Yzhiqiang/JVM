package com.yu.java;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 12:55 2021/12/12
 * @Modified By:
 */
public class OMTest extends ClassLoader{
    public static void main(String[] args) {
        int j = 0;
        try {
            OMTest oomTest = new OMTest();
            for (int i = 0; i < 10000; i++) {
                ClassWriter classWriter = new ClassWriter(0);
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                byte[] bytes = classWriter.toByteArray();
                oomTest.defineClass("Class" + i, bytes, 0, bytes.length);
                j++;
            }
        }finally {
            System.out.println(j);
        }
    }
}
