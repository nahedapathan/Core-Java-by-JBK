package com.tka.constructorchaining;

public class Student {
	
	int rollno;
	String name;
	int marks;
	String branch;
	public Student() {
		System.out.println(" Calling Zero parm constructor");
	}
	public Student(String name) {
		this();
		System.out.println(" Calling one parm constructor");
	}
	public Student(int rollno, String name, int marks, String branch) {
		this("priya");
		System.out.println(" Calling four parm constructor");
	}
	
	

}
