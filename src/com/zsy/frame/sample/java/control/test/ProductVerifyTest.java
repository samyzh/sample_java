package com.zsy.frame.sample.java.control.test;

/**
 * 商品规则验证；
 * @author samy
 *
 */
public class ProductVerifyTest {

	public static void main(String[] args) {
		if(compareNum("2-4",3)){
			System.out.println("通过");
		}else{
			System.out.println("不通过");
		}
	}
	
	  /**
	   * 判断传入产品数量是否符合规则
	   * eg:
	   * 2+  表示数量>=2
	   * 2,3,4  表示数量为2,3,4个
	   * 2-4  表示数量>=2 && <=4
	   * 2  表示数量只能为2个
	   *
	   * @param proNum 产品数量
	   * @param rule 规则数量
	   * @return true符合     false不符合
	   */
	  public static boolean compareNum(String rule,Integer proNum) {
	    if (rule.contains("+")) {
	      if (Integer.parseInt(rule.replace("+", "")) <= proNum) return true;
	    } else if (rule.contains("-")) {
	      String[] array = rule.split("-");
	      if (proNum >= Integer.parseInt(array[0]) && proNum <= Integer.parseInt(array[1])) return true;
	    } else if (rule.contains(",")) {
	      String[] array = rule.split(",");
	      for (int i = 0; i < array.length; i++) {
	        if (proNum == Integer.parseInt(array[i])) return true;
	      }
	    } else {
	      if (proNum == Integer.parseInt(rule)) return true;
	    }
	    return false;
	  }
}
