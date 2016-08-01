package com.zsy.frame.sample.java.control.test;

public class User implements Comparable<User>
// public class User
{
	private String name;
	private Integer order;
	private String fixNew;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getFixNew() {
		return fixNew;
	}

	public void setFixNew(String fixNew) {
		this.fixNew = fixNew;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", order=" + order + ", fixNew=" + fixNew + "]";
	}

	public int compareTo(User other) {
		// return this.getOrder().compareTo(arg0.getOrder());
//		return this.getName().compareTo(other.getName());
		User dept=(User) other;  
        int i=0;  
        i=this.fixNew.compareTo(dept.fixNew);  
        if(i!=0){//部门id不相等  
            return i;  
        }else{//部门id相等  
            i=this.name.compareTo(dept.name); 
            return i;  
            /*if(i!=0){//部门名称不相等  
                return i;  
            }else{//部门名称不相等  
                if(this.num>dept.num)return 1;  
                else if(this.num<dept.num)return -1;  
                else return 0;  
            }  */
        }  
          
	}

}

