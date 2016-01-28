package com.zsy.frame.sample.java.control.designmode.creational.factory.simplefactory.chart;

/**
 *
 工厂三兄弟之简单工厂模式
 * Chart接口充当抽象产品类，其子类HistogramChart、
 * PieChart和LineChart充当具体产品类，ChartFactory充当工厂类
 *
 * 简单工厂模式包含如下角色：
 Factory：工厂角色
 Product：抽象产品角色
 ConcreteProduct：具体产品角色
 */
class Client {
        public static void main(String args[]) {  
            Chart chart;  
            chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品  
            chart.display();  
        }  
    }  