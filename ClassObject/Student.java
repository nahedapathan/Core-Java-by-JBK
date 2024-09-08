package com.tka.ClassObject;

public class Student {

	String name;
	int rollno;
	
	public static void calculateMarks()
	{
		System.out.println("Claculated Marks....");
	}
	
	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.name="Ramesh";
		s1.rollno=101;
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		
		Student s2=new Student();
		s2.name="Priya";
		s2.rollno=23;
		System.out.println(s2.name);
		System.out.println(s2.rollno);
	}
	
}
