package com.tka.ConstructorEx1;

public class Customer {

	String cname;
	int cid;
	String cMob;
	
	public Customer()
	{
		System.out.println("Hello");
	}
	public Customer(String cname,int cid,String cMob)
	{
		this.cname=cname;
		this.cid=cid;
		this.cMob=cMob;
	}
	public void display()
	{
		System.out.println("Name "+cname+" Id "+cid+" Mobile No "+cMob);
	}
	
	
}
