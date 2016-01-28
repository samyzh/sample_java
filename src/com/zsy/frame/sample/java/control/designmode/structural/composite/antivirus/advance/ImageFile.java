package com.zsy.frame.sample.java.control.designmode.structural.composite.antivirus.advance;

//图像文件类：叶子构件
class ImageFile extends AbstractFile {
  private String name;

  public ImageFile(String name) {
    this.name = name;
  }

  /**
   * 作为抽象构件类的子类，在叶子构件中需要实现在抽象构件类中声明的所有方法，包括业务方法以及管理和访问子构件的方法，
   * 但是叶子构件不能再包含子构件，因此在叶子构件中实现子构件管理和访问方法时需要提供异常处理或错误提示
   */
  public void add(AbstractFile file) {
    System.out.println("对不起，不支持该方法！");
  }

  public void remove(AbstractFile file) {
    System.out.println("对不起，不支持该方法！");
  }

  public AbstractFile getChild(int i) {
    System.out.println("对不起，不支持该方法！");
    return null;
  }

  public void killVirus() {
    //模拟杀毒
    System.out.println("----对图像文件'" + name + "'进行杀毒");
  }
}  