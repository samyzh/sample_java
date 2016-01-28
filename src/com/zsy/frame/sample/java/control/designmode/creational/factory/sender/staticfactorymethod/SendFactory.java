package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.staticfactorymethod;

import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.MailSender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.Sender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.SmsSender;

public class SendFactory {  
      
    public static Sender produceMail(){
        return new MailSender();
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();
    }  
}  