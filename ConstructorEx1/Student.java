package com.tka.ConstructorEx1;

public class Student {
	String name;
	int rollno;
	
	//Zero-Parameterized Constructor
	public Student()
	{
		System.out.println("hello");
		name="neha";
		rollno=6;
	}
	public Student(String n,int r)
	{
		name=n;
		rollno=r;
	}
	
	public void display()
	{
		System.out.println("Name :"+name+"  Roll no :"+rollno);
	}

}
