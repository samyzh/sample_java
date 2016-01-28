package com.zsy.frame.sample.java.control.designmode.structural.composite.antivirus.base;

/**
 * 实现了杀毒软件的框架设计，但通过仔细分析，发现该设计方案存在如下问题：
 *
 * (1) 文件夹类Folder的设计和实现都非常复杂，需要定义多个集合存储不同类型的成员，
 * 而且需要针对不同的成员提供增加、删除和获取等管理和访问成员的方法，存在大量的冗余代码，系统维护较为困难；
 *
 * (2) 由于系统没有提供抽象层，客户端代码必须有区别地对待充当容器的文件夹Folder和充当叶子的ImageFile和TextFile，
 * 无法统一对它们进行处理；
 *
 * (3) 系统的灵活性和可扩展性差，如果需要增加新的类型的叶子和容器都需要对原有代码进行修改，例如如果需要在系统中增加一种新类型的视频
 * 文件VideoFile，则必须修改Folder类的源代码，否则无法在文件夹中添加视频文件。
 */
class Client {
  public static void main(String args[]) {
    Folder folder1, folder2, folder3;
    folder1 = new Folder("Samy的资料");
    folder2 = new Folder("图像文件");
    folder3 = new Folder("文本文件");

    ImageFile image1, image2;
    image1 = new ImageFile("小龙女.jpg");
    image2 = new ImageFile("张无忌.gif");

    TextFile text1, text2;
    text1 = new TextFile("九阴真经.txt");
    text2 = new TextFile("葵花宝典.doc");

    folder2.addImageFile(image1);
    folder2.addImageFile(image2);
    folder3.addTextFile(text1);
    folder3.addTextFile(text2);
    folder1.addFolder(folder2);
    folder1.addFolder(folder3);

    folder1.killVirus();
  }
}