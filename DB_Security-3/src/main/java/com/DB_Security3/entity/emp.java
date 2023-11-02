package com.DB_Security3.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emp")
public class emp {
	
	@Id
	private String empid;
	private String name;
	
	
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(String empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", name=" + name + "]";
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
