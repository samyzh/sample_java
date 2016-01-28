//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt;
//
///**
// * 数据加密类，充当子系统类。
// */
//class CipherMachine
//    {
//       public string Encrypt(string plainText)
//       {
//       Console.Write("数据加密，将明文转换为密文：");
//       string es = "";
//            char[] chars = plainText.ToCharArray();
//       foreach(char ch in chars)
//            {
//                string c = (ch % 7).ToString();
//           es += c;
//       }
//            Console.WriteLine(es);
//       return es;
//    }
//    }