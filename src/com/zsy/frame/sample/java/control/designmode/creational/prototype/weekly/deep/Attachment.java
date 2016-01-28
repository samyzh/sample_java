package com.zsy.frame.sample.java.control.designmode.creational.prototype.weekly.deep;

import  java.io.*;

//附件类

class  Attachment implements Serializable

{

       private  String name; //附件名

       public  void setName(String name)

       {

              this.name  = name;

       }

       public  String getName()

       {

              return  this.name;

       }

     public void download()

     {

            System.out.println("下载附件，文件名为" + name);

     }

}