package com.spring_security6.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


@EntityScan
public class demo6 {

	@Id
	private String id;
	private String name;
	private int fee;
	
	public demo6() {
		super();
		
	}
	public demo6(String id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "demo6 [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
}
