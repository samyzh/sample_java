package com.zsy.frame.sample.java.control.designmode.structural.composite.antivirus.base;

//文本文件类
class TextFile {
  private String name;

  public TextFile(String name) {
    this.name = name;
  }

  public void killVirus() {
    //简化代码，模拟杀毒
    System.out.println("----对文本文件'" + name + "'进行杀毒");
  }
}  