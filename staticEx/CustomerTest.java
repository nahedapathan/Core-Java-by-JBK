package com.tka.staticEx;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setdata(123,"naheda","SBI","Pune","752098745632","9876547896");
		Customer.setROI(5);
		c.showData();
	}
	

}
