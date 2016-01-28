package com.zsy.frame.sample.java.control.designmode.structural.composite.antivirus.advance;

//抽象文件类：抽象构件

/**
 * 透明组合模式与安全组合模式
 * 解决方案一：将叶子构件的add()、remove()等方法的实现代码移至AbstractFile类中，由AbstractFile提供统一的默认实现，代码如下所示：
 * 这样就产生了一种不透明的使用方式，即在客户端不能全部针对抽象构件类编程，需要使用具体叶子构件类型来定义叶子对象
 *
 * 解决方案二：除此之外，还有一种解决方法是在抽象构件AbstractFile中不声明任何用于访问和管理成员构件的方法，代码如下所示：
 *
 * 透明组合模式
 * 透明组合模式中，抽象构件Component中声明了所有用于管理成员对象的方法，
 * 包括add()、remove()以及getChild()等方法，这样做的好处是确保所有的构件类都有相同的接口
 */
abstract class AbstractFile {
  //解决方案一：
  //public void add(AbstractFile file) {
  //  System.out.println("对不起，不支持该方法！");
  //}
  //
  //public void remove(AbstractFile file) {
  //  System.out.println("对不起，不支持该方法！");
  //}
  //
  //public AbstractFile getChild(int i) {
  //  System.out.println("对不起，不支持该方法！");
  //  return null;
  //}
  /**
   * 客户端代码
   */
  //class Client {
  //  public static void main(String args[]) {
  //    //不能透明处理叶子构件
  //    ImageFile file1,file2;
  //    TextFile file3,file4;
  //    VideoFile file5;
  //    AbstractFile folder1,folder2,folder3,folder4;
  //    //其他代码省略
  //  }
  //}

  //解决方案二：
  //abstract class AbstractFile {
  //  public abstract void killVirus();
  //}

  /**
   * 客户端代码
   */
  //class Client {
  //  public static void main(String args[]) {
  //    AbstractFile file1,file2,file3,file4,file5;
  //    Folder folder1,folder2,folder3,folder4; //不能透明处理容器构件
  //    //其他代码省略
  //  }
  //}

  public abstract void add(AbstractFile file);

  public abstract void remove(AbstractFile file);

  public abstract AbstractFile getChild(int i);

  public abstract void killVirus();
}  