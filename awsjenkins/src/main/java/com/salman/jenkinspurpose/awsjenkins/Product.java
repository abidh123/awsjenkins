package com.salman.jenkinspurpose.awsjenkins;

public class Product {
	private int pid;
	private String name;
	private String brandname;
	
	public Product() {
		
	}

	public Product(int pid, String name, String brandname) {
		super();
		this.pid = pid;
		this.name = name;
		this.brandname = brandname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brandname=" + brandname + "]";
	}
	
	
	

}
