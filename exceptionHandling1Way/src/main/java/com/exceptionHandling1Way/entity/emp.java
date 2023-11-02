package com.exceptionHandling1Way.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="exp1")
public class emp {
	@Id
	private String empid;
	private String dept;
	private String doj;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(String empid, String dept, String doj) {
		super();
		this.empid = empid;
		this.dept = dept;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", dept=" + dept + ", doj=" + doj + "]";
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
}
