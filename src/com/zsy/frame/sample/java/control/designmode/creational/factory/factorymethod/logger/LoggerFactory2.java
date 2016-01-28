package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

/**
 * 工厂方法的隐藏演示；
 *
 * 有时候，为了进一步简化客户端的使用，还可以对客户端隐藏工厂方法
 * 此时，在工厂类中将直接调用产品类的业务方法，客户端无须调用工厂方法创建产品，直接通过工厂即可使用所创建的对象中的业务方法
 * 通过将业务方法的调用移入工厂类，可以直接使用工厂对象来调用产品对象的业务方法，客户端无须直接使用工厂方法，在某些情况下我们也可以使用这种设计方案。
 *
 * //改为抽象类
 * //在工厂类中直接调用日志记录器类的业务方法writeLog()
 *
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-12-06 20:22
 */
public abstract class LoggerFactory2 {
  public void writeLog() {
    Logger logger = this.createLogger();
    logger.writeLog();
  }
  public abstract Logger createLogger();
}
