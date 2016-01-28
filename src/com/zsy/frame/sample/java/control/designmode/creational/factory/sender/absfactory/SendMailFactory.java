package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.absfactory;

import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.MailSender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.Sender;

public class SendMailFactory implements Provider {  
      
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}  