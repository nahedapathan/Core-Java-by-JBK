package ArrayObjectEmployeeEx;

import java.util.Scanner;

public class EmployeeData {
	
	void userInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employee you want to enter :");
		int size=sc.nextInt();
		
		Employee e[]=new Employee[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Employee ID :");
			int id=sc.nextInt();
			
			System.out.println("Enter the Employee Name :");
			String name=sc.next();
			
			System.out.println("Enter the Department :");
			String dep=sc.next();
			
			System.out.println("Enter the Salary :");
			double sal=sc.nextDouble();
			
			System.out.println("Enter the Mobile no :");
			String mob=sc.next();
			
			e[i]=new Employee(id,name,dep,sal,mob);
		}
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i].getEmpId()+" "+e[i].getEmpName()+" "+e[i].getDept()+" "+e[i].getSal()+" "+e[i].getMob());
		}
	}

}
