package com.test03;

public class Developer extends Emp {

	private String dept;
	
	public Developer() {
		
	}
	
	public Developer(String name, int salary) {
		super(name,salary);
	}

	public Developer(String dept) {
		super();
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"부서: "+dept;
	}
	
	
	
	
}
