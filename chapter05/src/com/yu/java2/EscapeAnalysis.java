package com.yu.java2;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 20:25 2021/12/11
 * @Modified By:
 * 如何快速的判断是否发生了逃逸分析， 就看new的对象实体是否有可能在方法外被调用
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;
    /*
        方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*
        为成员变量赋值，发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }



}
