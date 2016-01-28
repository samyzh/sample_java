package com.zsy.frame.sample.java.control.designmode.compound.mvc;
//控制器
public interface BeatModelInterface {
      
    void initialize(); //在BeatModel被初始化之后，就会调用此方法  
    void on();          //打开节拍器  
    void off();         //关闭节拍器  
    void setBPM(int bpm);   //设置bmp值  
    int getBPM();           //获得当前bmp值  
    void registerObserver(BeatObserver o);   
    void removeObserver(BeatObserver o);  
    void registerObserver(BPMObserver o);  
    void removeObserver(BPMObserver o);  
}  