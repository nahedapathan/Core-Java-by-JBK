package com.tka.staticEx;

public class Customer {
	
	static int roi;
	int accno;
	String name;
	String bank_name;
	String city;
	String adhar;
	String mob_no;
	
	public static void setROI(int rate)
	{
		roi=rate;
	}
	
	public void setdata(int acc,String name1,String bank,String city1,String adhar_no,String mob_no)
	{
	    accno=acc;
	    name=name1;
	    bank_name=bank;
	    city=city1;
	    adhar=adhar_no;
		this.mob_no=mob_no;
	}
	
	public void showData()
	{
		System.out.println("Acc No :"+accno);
		System.out.println("Account Houlder Name :"+name);
		System.out.println("Bank Name :"+bank_name);
		System.out.println("City :"+city);
		System.out.println("Adhar No :"+adhar);
		System.out.println("Mobile no :"+mob_no);
		System.out.println("Rate of Interest of Your Bank is :"+roi);
	}
	

}
