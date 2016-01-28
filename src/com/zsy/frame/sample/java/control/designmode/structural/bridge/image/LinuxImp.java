package com.zsy.frame.sample.java.control.designmode.structural.bridge.image;

//Linux操作系统实现类：具体实现类
class LinuxImp implements ImageImp {  
    public void doPaint(Matrix m) {  
        //调用Linux系统的绘制函数绘制像素矩阵  
        System.out.print("在Linux操作系统中显示图像：");  
    }  
}  