package com.findByMethods.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "findbymethods")
public class emp {
	@Id
	private String empid;
	private String dept;
	private int salory;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalory() {
		return salory;
	}
	public void setSalory(int salory) {
		this.salory = salory;
	}
	public emp(String empid, String dept, int salory) {
		super();
		this.empid = empid;
		this.dept = dept;
		this.salory = salory;
	}
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", dept=" + dept + ", salory=" + salory + "]";
	}
	
	

}
