package com.getOnefeildData.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "oneFeildData")
public class student {
	@Id
    
	private String rollno;
	private String name;
	private String lname;
	private int std;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", lname=" + lname + ", std=" + std + "]";
	}
	
	public student(String rollno,String name,String lname,int std)
	{
		this.rollno=rollno;
		this.name=name;
		this.lname=lname;
		this.std=std;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}

}
