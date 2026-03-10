package com.ayush.hibernate_ex;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {
	@Id
	private String name;
	private int price ;
	private String cname;
	
	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + ", cname=" + cname + "]";
	}
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
