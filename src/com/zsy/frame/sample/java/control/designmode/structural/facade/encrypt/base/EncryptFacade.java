//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt;
//
///**
// * 充当外观类
// * @author: samy(hongfeiliuxing@gmail.com)
// * @datetime: 2015-08-06 12:03
// */
//public class EncryptFacade {
//    //维持对其他对象的引用
//    private FileReader reader;
//    private CipherMachine cipher;
//    private FileWriter writer;
//
//    public EncryptFacade()
//    {
//        reader = new FileReader();
//        cipher = new CipherMachine();
//        writer = new FileWriter();
//    }
//
//    //调用其他对象的业务方法
//    public void FileEncrypt(string fileNameSrc, string fileNameDes)
//    {
//        string plainStr = reader.Read(fileNameSrc);
//        string encryptStr = cipher.Encrypt(plainStr);
//        writer.Write(encryptStr, fileNameDes);
//    }
//}
