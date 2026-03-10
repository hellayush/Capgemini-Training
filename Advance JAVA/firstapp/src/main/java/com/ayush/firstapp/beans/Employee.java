package com.ayush.firstapp.beans;

public class Employee {
	private String name;
	private int salary;
	private String cname;
	
	public String toString()
	{
		return "Name : "  + getName() + "CName : " + getCname() +" Salary : " + getSalary();
	}
	public Employee()
	{
		
	}
	
	public Employee(String name , String cname , int salary)
	{
		this.name=name;
		this.cname=cname;
		this.salary=salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public String getCname()
	{
		return cname;
	}
	public int getSalary()
	{
		return salary;
	}
	
}
