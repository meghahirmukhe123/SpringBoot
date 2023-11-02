package com.Bank.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bank1")
public class mybank {

	@Id
	private String bankid;
	private String name;
	private int total;
	private int remove;
	private int remain;
	
	
	public mybank(String bankid, String name, int total, int remove, int remain) {
		super();
		this.bankid = bankid;
		this.name = name;
		this.total = total;
		this.remove = remove;
		this.remain = remain;
	}
	
	public mybank() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "mybank [bankid=" + bankid + ", name=" + name + ", total=" + total + ", remove=" + remove + ", remain="
				+ remain + "]";
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRemove() {
		return remove;
	}
	public void setRemove(int remove) {
		this.remove = remove;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	
	
}
