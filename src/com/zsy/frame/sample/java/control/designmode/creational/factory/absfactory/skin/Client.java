package com.zsy.frame.sample.java.control.designmode.creational.factory.absfactory.skin;

/**
 * 工厂三兄弟之抽象工厂模式
 * 抽象工厂模式； 产品族
 * SkinFactory接口充当抽象工厂，其子类SpringSkinFactory和SummerSkinFactory充当具体工厂，接口Button、TextField和ComboBox充当抽象产品，
 * 其子类SpringButton、SpringTextField、SpringComboBox和SummerButton、SummerTextField、SummerComboBox充当具体产品
 */
class Client {
        public static void main(String args[]) {  
            //使用抽象层定义  
            SkinFactory factory;  
            Button bt;  
            TextField tf;  
            ComboBox cb;  
//            factory = (SkinFactory)XMLUtil.getBean();
            factory = new SummerSkinFactory();
            bt = factory.createButton();
            tf = factory.createTextField();  
            cb = factory.createComboBox();  
            bt.display();  
            tf.display();  
            cb.display();  
        }  
    }  