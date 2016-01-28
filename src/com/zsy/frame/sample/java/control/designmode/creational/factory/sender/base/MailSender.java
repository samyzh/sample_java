package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base;
/**
 * @description：其次，创建实现类：
 * @author samy
 * @date 2015-3-17 下午11:08:28
 */
public class MailSender implements Sender {  
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
}  