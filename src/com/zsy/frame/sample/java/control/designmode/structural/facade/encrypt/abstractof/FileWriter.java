package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt.abstractof;//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt;
//
///**
// * 文件保存类，充当子系统类
// */
//class FileWriter {
//    public void Write(string encryptStr, string fileNameDes) {
//        Console.WriteLine("保存密文，写入文件。");
//        FileStream fs = null;
//        try {
//            fs = new FileStream(fileNameDes, FileMode.Create);
//            byte[] str = Encoding.Default.GetBytes(encryptStr);
//            fs.Write(str, 0, str.Length);
//            fs.Flush();
//            fs.Close();
//        } catch (FileNotFoundException e) {
//            Console.WriteLine("文件不存在！");
//        } catch (IOException e) {
//            Console.WriteLine(e.Message);
//            Console.WriteLine("文件操作错误！");
//        }
//    }
//}