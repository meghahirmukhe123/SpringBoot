package com.exceptionHandling2Way.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exp2")
public class book {
	@Id
	private String bookid;
	private String bookname;
	private int price;
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book(String bookid, String bookname, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", booknameString=" + bookname + ", price=" + price + "]";
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBooknameString(String bookname) {
		this.bookname= bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
