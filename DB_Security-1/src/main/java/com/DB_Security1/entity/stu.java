package com.DB_Security1.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "demo")
public class stu {
	
	@Id
	private String stuid;
	private String stuname;
	private int stuno;
	
	
	public stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public stu(String stuid, String stuname, int stuno) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuno = stuno;
	}
	@Override
	public String toString() {
		return "stu [stuid=" + stuid + ", stuname=" + stuname + ", stuno=" + stuno + "]";
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	

}
