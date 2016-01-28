package com.zsy.frame.sample.java.control.designmode.structural.bridge.image;

//抽象图像类：抽象类
abstract class Image {  
    protected ImageImp imp;  
  
    public void setImageImp(ImageImp imp) {  
        this.imp = imp;  
    }   
  
    public abstract void parseFile(String fileName);  
}  