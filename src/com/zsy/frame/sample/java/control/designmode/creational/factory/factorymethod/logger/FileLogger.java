package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

//文件日志记录器：具体产品
class FileLogger implements Logger {  
    public void writeLog() {  
        System.out.println("文件日志记录。");  
    }  
} 