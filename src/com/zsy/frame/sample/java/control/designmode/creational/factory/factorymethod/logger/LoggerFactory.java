package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

//日志记录器工厂接口：抽象工厂
interface LoggerFactory {
  public Logger createLogger();

  /**
   * 重载的工厂方法,演示
   * 例如可以为各种日志记录器提供默认实现；还可以为数据库日志记录器提供数据库连接字符串，
   * 为文件日志记录器提供文件路径；也可以将参数封装在一个Object类型的对象中，通过Object对象将配置参数传入工厂类。
   */
  public Logger createLogger(String args);

  public Logger createLogger(Object obj);

  /**
   * 工厂方法的隐藏演示；
   有时候，为了进一步简化客户端的使用，还可以对客户端隐藏工厂方法
   此时，在工厂类中将直接调用产品类的业务方法，客户端无须调用工厂方法创建产品，直接通过工厂即可使用所创建的对象中的业务方法
   通过将业务方法的调用移入工厂类，可以直接使用工厂对象来调用产品对象的业务方法，客户端无须直接使用工厂方法，在某些情况下我们也可以使用这种设计方案。
   */

}  