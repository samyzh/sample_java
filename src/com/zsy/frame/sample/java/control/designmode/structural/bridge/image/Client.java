package com.zsy.frame.sample.java.control.designmode.structural.bridge.image;

class Client {
  public static void main(String args[]) {
    Image image;
    ImageImp imp;
    //        image = (Image)XMLUtil.getBean("image");
    //        imp = (ImageImp)XMLUtil.getBean("os");
    image = new JPGImage();
    imp = new WindowsImp();
    image.setImageImp(imp);
    image.parseFile("小龙女");
  }
} 