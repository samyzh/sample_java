package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

/**
 * 工厂三兄弟之工厂方法模式
 * 工厂方法模式;单产品
 * Logger接口充当抽象产品，其子类FileLogger和DatabaseLogger充当具体产品，LoggerFactory接口充当抽象工厂，
 * 其子类FileLoggerFactory和DatabaseLoggerFactory充当具体工厂
 */
public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();

        //工厂方法的隐藏
        LoggerFactory2 factory2;
        //factory = (LoggerFactory)XMLUtil.getBean();
        //factory2 = new LoggerFactory2() {
        //    @Override public Logger createLogger() {
        //        return null;
        //    }
        //};
        factory2 = new FileLoggerFactory2();
        factory2.writeLog(); //直接使用工厂对象来调用产品对象的业务方法
    }
} 