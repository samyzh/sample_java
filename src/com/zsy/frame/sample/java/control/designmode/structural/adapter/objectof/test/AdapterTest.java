package com.zsy.frame.sample.java.control.designmode.structural.adapter.objectof.test;

/**
 * 方式二：没有在Adapter中new出来目标适配器，而是通过对象构造进入的
 */
public class AdapterTest {
  
    public static void main(String[] args) {  
        Source source = new Source();  
        Targetable target = new Wrapper(source);  
        target.method1();  
        target.method2();  
    }  
}  