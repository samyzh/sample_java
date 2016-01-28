package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.advance;

/**
 * 界面组件之间存在较为复杂的交互关系：如果删除一个客户，要在客户列表(List)中删掉对应的项，
 * 客户选择组合框(ComboBox)中客户名称也将减少一个；如果增加一个客户信息，客户列表中需增加一个客户，且组合框中也将增加一项。
 * <p>
 * 如果实现界面组件之间的交互是Sunny公司开发人员必须面对的一个问题？
 * <p>
 * 公司开发人员对组件之间的交互关系进行了分析，结果如下：
 * <p>
 * (1) 当用户单击“增加”按钮、“删除”按钮、“修改”按钮或“查询”按钮时，界面左侧的“客户选择组合框”、
 * “客户列表”以及界面中的文本框将产生响应。
 * <p>
 * (2) 当用户通过“客户选择组合框”选中某个客户姓名时，“客户列表”和文本框将产生响应。
 * <p>
 * (3) 当用户通过“客户列表”选中某个客户姓名时，“客户选择组合框”和文本框将产生响应
 * <p>
 * <p>
 * 由于在本实例中不同的组件类（即不同的同事类）所拥有的方法并不完全相同，因此中介者类没有针对抽象同事类编程，
 * 导致在具体中介者类中需要维持对具体同事类的引用，客户端代码无法完全透明地对待所有同事类和中介者类。
 * 在某些情况下，如果设计得当，可以在客户端透明地对同事类和中介者类编程，这样系统将具有更好的灵活性和可扩展性
 */
class Client {
  public static void main(String args[]) {
    //定义中介者对象
    ConcreteMediator mediator;
    mediator = new ConcreteMediator();

    //定义同事对象
    Button addBT = new Button();
    List list = new List();
    ComboBox cb = new ComboBox();
    TextBox userNameTB = new TextBox();

    addBT.setMediator(mediator);
    list.setMediator(mediator);
    cb.setMediator(mediator);
    userNameTB.setMediator(mediator);

    mediator.addButton = addBT;
    mediator.list = list;
    mediator.cb = cb;
    mediator.userNameTextBox = userNameTB;

    addBT.changed();
    System.out.println("-----------------------------");
    list.changed();
  }
}