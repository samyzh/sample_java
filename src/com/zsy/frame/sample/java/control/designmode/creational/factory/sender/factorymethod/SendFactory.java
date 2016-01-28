package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.factorymethod;

import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.MailSender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.Sender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.SmsSender;

public class SendFactory {  
   public Sender produceMail(){
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();
    }  
}  