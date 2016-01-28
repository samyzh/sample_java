package com.zsy.frame.sample.java.control.designmode.structural.composite.test;

/**
 * @author samy
 * @description： 组合模式（Composite）
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便，看看关系图：
 * <p>
 * 此模式能建立在多层级的包含关系（即多层级Whole-part关系）
 * @date 2015-3-19 下午10:05:58
 */
public class Tree {
  TreeNode root = null;

  public Tree(String name) {
    root = new TreeNode(name);
  }

  public static void main(String[] args) {
    Tree tree = new Tree("A");
    TreeNode nodeB = new TreeNode("B");
    TreeNode nodeC = new TreeNode("C");

    nodeB.add(nodeC);
    tree.root.add(nodeB);
    System.out.println("build the tree finished!");
  }
}