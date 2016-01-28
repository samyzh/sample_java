//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt.abstractof;
//
///**
// * 如果在应用实例“文件加密模块”中需要更换一个加密类，不再使用原有的基于求模运算的加密类CipherMachine，
// * 而改为基于移位运算的新加密类NewCipherMachine，其代码如下：
// */
//class NewCipherMachine
//    {
//        public string Encrypt(string plainText)
//        {
//            Console.Write("数据加密，将明文转换为密文：");
//            string es = "";
//            int key = 10;//设置密钥，移位数为10
//            char[] chars = plainText.ToCharArray();
//            foreach(char ch in chars)
//            {
//                int temp = Convert.ToInt32(ch);
//                //小写字母移位
//                if (ch >= 'a' && ch <= 'z') {
//                    temp += key % 26;
//                    if (temp > 122) temp -= 26;
//                    if (temp < 97) temp += 26;
//                }
//                //大写字母移位
//                if (ch >= 'A' && ch <= 'Z') {
//                    temp += key % 26;
//                    if (temp > 90) temp -= 26;
//                    if (temp < 65) temp += 26;
//                }
//                es += ((char)temp).ToString();
//            }
//            Console.WriteLine(es);
//            return es;
//        }
//    }