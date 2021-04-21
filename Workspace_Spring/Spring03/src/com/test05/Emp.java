package com.test05;

public class Emp {
	
	private String name; 
	private int salaty;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int salaty) {
		super();
		this.name = name;
		this.salaty = salaty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaty() {
		return salaty;
	}
	public void setSalaty(int salaty) {
		this.salaty = salaty;
	}
	@Override
	public String toString() {
		return "이름 : " + name + "\t 월급 :" + salaty ;
	} 
	
	

}
