package com.exceptionHandling2Way.entity;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "exp2")
public class book {

	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book(String bootid, String bookname, int price) {
		super();
		this.bootid = bootid;
		this.bookname = bookname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [bootid=" + bootid + ", bookname=" + bookname + ", price=" + price + "]";
	}
	public String getBootid() {
		return bootid;
	}
	public void setBootid(String bootid) {
		this.bootid = bootid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	private String bootid;
	private String bookname;
	private int price;
}
