package com.zsy.frame.sample.java.control.designmode.creational.builder.base;

import java.util.ArrayList;
import java.util.List;

import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.MailSender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.Sender;
import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.SmsSender;

public class Builder {  
      
    private List<Sender> list = new ArrayList<Sender>();  
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}  