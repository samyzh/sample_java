package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

//数据库日志记录器：具体产品
class DatabaseLogger implements Logger {  
    public void writeLog() {  
        System.out.println("数据库日志记录。");  
    }  
} 