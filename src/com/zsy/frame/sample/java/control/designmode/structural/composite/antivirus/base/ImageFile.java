package com.zsy.frame.sample.java.control.designmode.structural.composite.antivirus.base;

//为了突出核心框架代码，我们对杀毒过程的实现进行了大量简化

import java.util.*;

//图像文件类  
class ImageFile {
  private String name;

  public ImageFile(String name) {
    this.name = name;
  }

  public void killVirus() {
    //简化代码，模拟杀毒
    System.out.println("----对图像文件'" + name + "'进行杀毒");
  }
}  