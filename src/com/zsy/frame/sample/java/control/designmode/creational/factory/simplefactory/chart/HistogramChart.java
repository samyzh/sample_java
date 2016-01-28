package com.zsy.frame.sample.java.control.designmode.creational.factory.simplefactory.chart;

//柱状图类：具体产品类
class HistogramChart implements Chart {  
    public HistogramChart() {  
        System.out.println("创建柱状图！");  
    }  
      
    public void display() {  
        System.out.println("显示柱状图！");  
    }  
}  