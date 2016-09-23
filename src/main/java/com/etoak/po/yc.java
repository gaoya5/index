package com.etoak.po;

public class yc {
	private int id;
	private String name;
	private String pass;
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public yc(){}
	
	public yc(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}	
}
