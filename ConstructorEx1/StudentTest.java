package com.tka.ConstructorEx1;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
		
		Student s2=new Student("Priya",1);
		s2.display();
		
		Student s3=new Student("Shreya",2);
		s3.display();
		
		Student s4=new Student("Kavya",3);
		s4.display();
	}
}
