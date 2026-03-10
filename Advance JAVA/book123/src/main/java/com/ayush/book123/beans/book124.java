package com.ayush.book123.beans;

public class book124 {

	private String name ; 
	private int price;
	private String aname;
	private String pname;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public book124() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book124(String name, int price, String aname, String pname) {
		super();
		this.name = name;
		this.price = price;
		this.aname = aname;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", aname=" + aname + ", pname=" + pname + "]";
	}
	
}
