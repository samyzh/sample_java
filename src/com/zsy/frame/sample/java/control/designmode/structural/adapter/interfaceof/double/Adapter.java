//package com.zsy.frame.sample.java.control.designmode.structural.adapter;
//
// 双向适配器的应用，目前没有实现；
/**
 * 双向适配器
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，
 * 可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
 *
 在对象适配器的使用过程中，如果在适配器中同时包含对目标类和适配者类的引用，适配者可以通过它调用目标类中的方法，
 目标类也可以通过它调用适配者类中的方法，那么该适配器就是一个双向适配器
 */
//class Adapter implements Target,Adaptee {
//        //同时维持对抽象目标类和适配者的引用
//        private Target target;
//        private Adaptee adaptee;
//
//        public Adapter(Target target) {
//            this.target = target;
//        }
//
//        public Adapter(Adaptee adaptee) {
//            this.adaptee = adaptee;
//        }
//
//        public void request() {
//            adaptee.specificRequest();
//        }
//
//        public void specificRequest() {
//            target.request();
//        }
//    }