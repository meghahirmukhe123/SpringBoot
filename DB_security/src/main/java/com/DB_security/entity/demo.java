package com.DB_security.entity;

public class demo {
	private String id;
	private String name;
	
	
	public demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public demo(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + "]";
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

}
