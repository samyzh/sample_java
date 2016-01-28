package com.zsy.frame.sample.java.control.designmode.creational.factory.absfactory.skin;

//Spring皮肤工厂：具体工厂
class SpringSkinFactory implements SkinFactory {  
    public Button createButton() {  
        return new SpringButton();  
    }  
  
    public TextField createTextField() {  
        return new SpringTextField();  
    }  
  
    public ComboBox createComboBox() {  
        return new SpringComboBox();  
    }  
}  