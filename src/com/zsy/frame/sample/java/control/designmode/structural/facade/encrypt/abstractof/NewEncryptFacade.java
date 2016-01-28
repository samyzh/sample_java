//package com.zsy.frame.sample.java.control.designmode.structural.facade.encrypt.abstractof;
//
//class NewEncryptFacade extends AbstractEncryptFacade
//    {
//        private FileReader reader;
//        private NewCipherMachine cipher;
//        private FileWriter writer;
//
//        public NewEncryptFacade()
//        {
//            reader = new FileReader();
//            cipher = new NewCipherMachine();
//            writer = new FileWriter();
//        }
//
//        public override void FileEncrypt(string fileNameSrc, string fileNameDes)
//        {
//            string plainStr = reader.Read(fileNameSrc);
//            string encryptStr = cipher.Encrypt(plainStr);
//            writer.Write(encryptStr, fileNameDes);
//        }
//    }