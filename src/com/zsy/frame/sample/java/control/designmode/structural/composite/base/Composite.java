//package com.zsy.frame.sample.java.control.designmode.structural.composite.base;
//
//import java.util.ArrayList;
//
//public class Composite extends Component
//{
//    private ArrayList list = new ArrayList();
//
//    public void add(Component c)
//    {
//        list.add(c);
//    }
//
//    public void remove(Component c)
//    {
//        list.remove(c);
//    }
//
//    public Component getChild(int i)
//    {
//        (Component)list.get(i);
//    }
//
//    public void operation()
//    {
//        for(Object obj:list)
//        {
//            ((Component)obj).operation();
//        }
//    }
//}