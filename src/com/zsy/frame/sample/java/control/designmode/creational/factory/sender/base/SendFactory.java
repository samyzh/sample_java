package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base;

/**
 * @description：最后，建工厂类：
 * @author samy
 * @date 2015-3-17 下午11:08:58
 */
public class SendFactory {  
    public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
}  