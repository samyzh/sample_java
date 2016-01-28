//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt.abstractof;
//
///**
// *  * 抽象外观类:
// * 对于新的业务需求，不需要修改原有外观类，而对应增加一个新的具体外观类，由新的具体外观类来关联新的子系统对象，
// * 同时通过修改配置文件来达到不修改任何源代码并更换外观类的目的
// *
// * @author: samy(hongfeiliuxing@gmail.com)
// * @datetime: 2015-08-06 12:13
// */
//public class Client {
//    static void Main(string[] args)
//    {
//        AbstractEncryptFacade ef; //针对抽象外观类编程
//        //读取配置文件
//        string facadeString = ConfigurationManager.AppSettings["facade"];
//        //反射生成对象
//        ef = (AbstractEncryptFacade)Assembly.Load("FacadeSample"). CreateInstance (facadeString);
//        ef.FileEncrypt("src.txt", "des.txt");
//        Console.Read();
//    }
//}
