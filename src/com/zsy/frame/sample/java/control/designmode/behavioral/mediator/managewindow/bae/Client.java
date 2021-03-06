package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.bae;

/**
 * 欲开发一套CRM系统，其中包含一个客户信息管理模块
 * Sunny公司开发人员对组件之间的交互关系进行了分析，结果如下：
 * <p>
 * (1) 当用户单击“增加”按钮、“删除”按钮、“修改”按钮或“查询”按钮时，界面左侧的“客户选择组合框”、
 * “客户列表”以及界面中的文本框将产生响应。
 * <p>
 * (2) 当用户通过“客户选择组合框”选中某个客户姓名时，“客户列表”和文本框将产生响应。
 * <p>
 * (3) 当用户通过“客户列表”选中某个客户姓名时，“客户选择组合框”和文本框将产生响应。
 * <p>
 * <p>
 * 初始结构图和上述代码，我们不难发现该设计方案存在如下问题：
 * <p>
 * (1) 系统结构复杂且耦合度高：每一个界面组件都与多个其他组件之间产生相互关联和调用，若一个界面组件对象发生变化，
 * 需要跟踪与之有关联的其他所有组件并进行处理，系统组件之间呈现一种较为复杂的网状结构，组件之间的耦合度高。
 * <p>
 * (2) 组件的可重用性差：由于每一个组件和其他组件之间都具有很强的关联，若没有其他组件的支持，一个组件很难被另一个系统或模块重用，
 * 这些组件表现出来更像一个不可分割的整体，而在实际使用时，我们往往需要每一个组件都能够单独重用，
 * 而不是重用一个由多个组件组成的复杂结构。
 * <p>
 * (3) 系统的可扩展性差：如果在上述系统中增加一个新的组件类，则必须修改与之交互的其他组件类的源代码，将导致多个类的源代码需要修改
 * ，同样，如果要删除一个组件也存在类似的问题，这违反了“开闭原则”，可扩展性和灵活性欠佳。
 *
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-16 17:21
 */
public class Client {
}
