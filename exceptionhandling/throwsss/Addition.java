package exceptionhandling.throwsss;

import java.util.Scanner;

public class Addition {
	
	static int add(int a,int b) throws IllegalArgumentException
	{
		if(a<0 || b<0)
		{
			throw new IllegalArgumentException("Do not Pass Negative Value");
		}
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the FNO :");
			int a=sc.nextInt();
			
			System.out.println("Enter the SNO :");
			int b=sc.nextInt();
			
			int res=add(a,b);
			System.out.println("Result is :"+res);
		}catch(IllegalArgumentException e)
		{
		      e.printStackTrace();
		}
	}

}
