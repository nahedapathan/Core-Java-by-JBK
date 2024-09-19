package ArrayOfObject;

import java.util.Scanner;

public class StudentData {
	
//	void createArrayofStudent()
//	{
//		Student s1=new Student("riya",101);
//		Student s2=new Student("Priya",102);
//		Student s3=new Student("Akash",102);
//		Student s4=new Student("rohit",102);
//		Student s5=new Student("sahil",102);
//		
//		Student s[]=new Student[5];
//		s[0]=s1;
//		s[1]=s2;
//		s[2]=s3;
//		s[3]=s4;
//		s[4]=s5;
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		
//	}
//	
	void userInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Student You Want to Enter :");
		int size=sc.nextInt();
		
		Student s[]=new Student[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the name of Student :");
			String n=sc.next();
			
			System.out.println("Enter the Roll no Student :");
			int r=sc.nextInt();
			
			s[i]=new Student(n,r);
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getName()+" "+s[i].getRollno());
		}
	}
	
	
	
	

}
