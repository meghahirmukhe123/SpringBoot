package com.bank_project.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mybank")
public class bank {
	@Id
	private String bankid;
	private String name;
	private static int total;
	private static int remove;
	private int remain;
	
	
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bank(String bankid, String name, int remain) {
		super();
		this.bankid = bankid;
		this.name = name;
		this.remain = remain;
	}
	@Override
	public String toString() {
		return "bank [bankid=" + bankid + ", name=" + name + ", remain=" + remain + "]";
	}
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		bank.total = total;
	}
	public static int getRemove() {
		return remove;
	}
	public static void setRemove(int remove) {
		bank.remove = remove;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	

}
