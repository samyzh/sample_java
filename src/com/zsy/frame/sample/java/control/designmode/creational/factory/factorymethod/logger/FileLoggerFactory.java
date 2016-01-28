package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

//文件日志记录器工厂类：具体工厂
class FileLoggerFactory implements LoggerFactory {  
    public Logger createLogger() {  
            //创建文件日志记录器对象  
            Logger logger = new FileLogger();   
            //创建文件，代码省略  
            return logger;  
    }

  @Override public Logger createLogger(String args) {
    return null;
  }

  @Override public Logger createLogger(Object obj) {
    return null;
  }
}  