//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt;
//
///**
//具体的流程包括三个部分，分别是读取源文件、加密、保存加密之后的文件，
//        其中，读取文件和保存文件使用流来实现，加密操作通过求模运算实现。
//        这三个操作相对独立，为了实现代码的独立重用，让设计更符合单一职责原则，这三个操作的业务代码封装在三个不同的类中。
// * @author: samy(hongfeiliuxing@gmail.com)
// * @datetime: 2015-08-06 12:06
// */
//public class Client {
//    static void Main(string[] args)
//    {
//        EncryptFacade ef = new EncryptFacade();
//        ef.FileEncrypt("src.txt", "des.txt");
//        Console.Read();
//    }
//}
