package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.absfactory;

import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.Sender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.SmsSender;

public class SendSmsFactory implements Provider{  
  
    @Override  
    public Sender produce() {  

//        new Runtime();
        return new SmsSender();
    }  
}  