package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.logger;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-12-06 20:27
 */
public class FileLoggerFactory2 extends LoggerFactory2 {
  @Override public Logger createLogger() {
    return new FileLogger();
  }
}
