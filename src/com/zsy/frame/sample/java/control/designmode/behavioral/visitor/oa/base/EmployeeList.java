package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.oa.base;

import java.util.*;

/**
 * 在EmployeeList类的handle()方法中，通过对部门名称和员工类型进行判断，不同部门对不同类型的员工进行了不同的处理，
 * 满足了员工数据汇总的要求。但是该解决方案存在如下几个问题：
 * <p>
 * (1) EmployeeList类非常庞大，它将各个部门处理各类员工数据的代码集中在一个类中，在具体实现时，代码将相当冗长，
 * EmployeeList类承担了过多的职责，既不方便代码的复用，也不利于系统的扩展，违背了“单一职责原则”。
 * <p>
 * (2)在代码中包含大量的“if…else…”条件判断语句，既需要对不同部门进行判断，又需要对不同类型的员工进行判断，
 * 还将出现嵌套的条件判断语句，导致测试和维护难度增大。
 * <p>
 * (3)如果要增加一个新的部门来操作员工集合，不得不修改EmployeeList类的源代码，在handle()方法中增加一个新的条件判断语句
 * 和一些业务处理代码来实现新部门的访问操作。这违背了“开闭原则”，系统的灵活性和可扩展性有待提高。
 * <p>
 * (4)如果要增加一种新类型的员工，同样需要修改EmployeeList类的源代码，在不同部门的处理代码中增加对新类型员工的处理逻辑，
 * 这也违背了“开闭原则”。
 */
class EmployeeList {
  private ArrayList<Employee> list = new ArrayList<Employee>(); //员工集合

  //增加员工
  public void addEmployee(Employee employee) {
    list.add(employee);
  }

  //处理员工数据
  public void handle(String departmentName) {
    if (departmentName.equalsIgnoreCase("财务部")) //财务部处理员工数据
    {
      for (Object obj : list) {
        if (obj.getClass().getName().equalsIgnoreCase("FulltimeEmployee")) {
          System.out.println("财务部处理全职员工数据！");
        } else {
          System.out.println("财务部处理兼职员工数据！");
        }
      }
    } else if (departmentName.equalsIgnoreCase("人力资源部")) //人力资源部处理员工数据
    {
      for (Object obj : list) {
        if (obj.getClass().getName().equalsIgnoreCase("FulltimeEmployee")) {
          System.out.println("人力资源部处理全职员工数据！");
        } else {
          System.out.println("人力资源部处理兼职员工数据！");
        }
      }
    }
  }
}