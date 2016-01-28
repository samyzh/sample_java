package com.zsy.frame.sample.java.control.designmode.structural.composite.antivirus.advance;

/**
 * 透明组合模式
 * 透明组合模式也是组合模式的标准形式
 * 透明组合模式的缺点是不够安全，因为叶子对象和容器对象在本质上是有区别的。
 * 叶子对象不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供add()、remove()以及getChild()等方法是没有意义的，
 * 这在编译阶段不会出错，但在运行阶段如果调用这些方法可能会出错（如果没有提供相应的错误处理代码）
 */
class Client {
  public static void main(String args[]) {

    /**
     * 全透明模式
     */
    //针对抽象构件编程
    AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;

    /**
     * 半透明模式
     */
    /**
     * 解决方案一：将叶子构件的add()、remove()等方法的实现代码移至AbstractFile类中，由AbstractFile提供统一的默认实现，代码如下所示：
     */
    ////不能透明处理叶子构件
    //ImageFile file1,file2;
    //TextFile file3,file4;
    //VideoFile file5;
    //AbstractFile folder1,folder2,folder3,folder4;
    /**
     * 解决方案二：除此之外，还有一种解决方法是在抽象构件AbstractFile中不声明任何用于访问和管理成员构件的方法，
     */
    //AbstractFile file1,file2,file3,file4,file5;
    //Folder folder1,folder2,folder3,folder4; //不能透明处理容器构件

    folder1 = new Folder("Samy的资料");
    folder2 = new Folder("图像文件");
    folder3 = new Folder("文本文件");
    folder4 = new Folder("视频文件");

    file1 = new ImageFile("小龙女.jpg");
    file2 = new ImageFile("张无忌.gif");

    file3 = new TextFile("九阴真经.txt");
    file4 = new TextFile("葵花宝典.doc");

    file5 = new VideoFile("笑傲江湖.rmvb");

    folder2.add(file1);
    folder2.add(file2);

    folder3.add(file3);
    folder3.add(file4);

    folder4.add(file5);

    folder1.add(folder2);
    folder1.add(folder3);
    folder1.add(folder4);

    /**
     * 如果需要更换操作节点，例如只需对文件夹“文本文件”进行杀毒，客户端代码只需修改一行即可，将代码：
     folder1.killVirus();
     改为：
     folder3.killVirus();
     */
    //从“Samy的资料”节点开始进行杀毒操作
    folder1.killVirus();
  }
}